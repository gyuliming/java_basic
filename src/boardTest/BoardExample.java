package boardTest;

// 사용자가 현재 게시물 목록을 읽을 수 있다.
// 사용자가 메뉴를 선택하여 글을 생성, 생성한 글을 읽을 수도 있고, 삭제할 수도 있다.
// 사용자는 게시판 프로그램을 종료할 수 있다.

import boardTest.common.BoardText;

import java.text.SimpleDateFormat;
import java.util.*;

public class BoardExample {
    static Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    private static final String menuNumberRegex = "[1-4]"; // 1 ~ 4의 문자열만 사용
    private static final String checkNumber = "[1-2]"; // 1 ~ 2
    private static final String readOptionRegex = "[1-3]"; // 1 ~ 3
    private static int size = 1; // 공용 변수

    BoardManager boardManager;

    // Board 매니저가 게시판을 관리한다. 인젝션
    public BoardExample(BoardManager boardManager)  {
        this.boardManager = boardManager;
    }

    // 게시물 메인 메뉴 선택 기능
    public void run() {
        while(true) {
            list();
            String inputNum = sc.nextLine();

            if (inputNum.equals("4")) {
                System.out.println("** 게시판 종료 **");
                break;
            }

            if (inputNum.matches(menuNumberRegex)) {
                switch (inputNum) {
                    case "1" -> create();
                    case "2" -> {
                        if (boardManager.getBoardMap().isEmpty()) System.out.println("게시물이 비어있습니다.");
                        else read();
                    }
                    case "3" -> {
                        if (boardManager.getBoardMap().isEmpty()) System.out.println("게시물이 비어있습니다.");
                        else clear();
                    }
                }
            } else System.out.println("숫자를 잘못 입력하셨습니다.");
        }
    }

    // 현재 게시판의 전체 게시물 목록 출력
    public void list() {
        // 게시판은 매니저가 담당하므로, 매니저한테 받아온다.
        // 보드 매니저가 관리하는 보드 맵의 주소 값을 받아온다.
        Map<String, Board> boardMap = boardManager.getBoardMap();

        System.out.println("\n[게시물 목록]");
        System.out.println("-".repeat(60));
        System.out.printf("%-4s %-20s %-20s %-20s\n", "no", "writer", "date", "title");

        // Manager 에게 전체 게시물 목록 요청
        // 보드 맵의 키-값 쌍(엔트리) 전체를 entrySet()으로 가져와 LinkedList(entryList) 에 담음
        List<Map.Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        // 내림차순 정렬 (최신 글이 맨 위)
        Collections.reverse(entryList);

        // entryList 를 돌면서 각 엔트리를 꺼냄 -> 엔트리 타입은 Map.Entry<String, Board> 타입
        entryList.forEach(entry -> {
            // 값(Board 객체)를 꺼내서 value 변수에 담는다.
            Board value = entry.getValue();
            System.out.printf("%-4d %-20s %-20s %-20s\n", value.getBno(), value.getBWriter(), sdf.format(value.getBDate()), value.getBTitle());
        });

        System.out.println("-".repeat(60));

        mainMenu();
    }

    // checkMenu() : 보조 메뉴 확인, 선택 메서드
    public boolean checkMenu() {
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");

        while (true) {
            String inputNum = sc.nextLine();
            if (inputNum.matches(checkNumber)) {
                return inputNum.equals("1");
            } else System.out.println("숫자를 잘못 입력하셨습니다..");
        }
    }

    // mainMenu()
    public void mainMenu() {
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
    }


    // 1. create() : 작성한 새 글 저장 기능 -> Map 컬렉션에 저장
    public void create() {
        System.out.println();
        System.out.println("[새 게시물 입력]");
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("내용 : ");
        String content = sc.nextLine();
        System.out.print("작성자 : ");
        String writer = sc.nextLine();

        // 1번 입력
        if (checkMenu()) {
            // BoardBuilder 를 이용하여 새 글 생성
            Board board = Board.builder()
                    .bno(size)
                    .bWriter(writer)
                    .bTitle(title)
                    .bContent(content)
                    .bDate(new Date())
                    .build();

            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(size), board);
            boardManager.setBoardMap(boardMap);
            size++;
        }
    }

    // 2. read()
    public void read() {
        System.out.println("*** read() 메소드 실행됨");
        System.out.println();
        System.out.println("[게시물 읽기]");
        int inputNum = 0;

        while (true) {
            try {
                System.out.print("bno: ");
                inputNum = sc.nextInt();
                sc.nextLine();

                if (inputNum < 0 || inputNum > boardManager.getBoardMap().size()) {
                    throw new IllegalArgumentException("해당 게시물은 존재하지 않습니다.");
                } else {
                    Map<String, Board> boardMap = boardManager.getBoardMap();
                    System.out.println("#".repeat(30));
                    Board boardOne = boardMap.get(String.valueOf(inputNum)); // inputNum 에 해당하는 키 값 가져오기
                    System.out.println("번호: " + boardOne.getBno());
                    System.out.println("제목: " + boardOne.getBTitle());
                    System.out.println("내용: " + boardOne.getBContent());
                    System.out.println("작성자: " + boardOne.getBWriter());
                    System.out.println("날짜: " + sdf.format(boardOne.getBDate()));
                    System.out.println("#".repeat(30));
                    readOption(inputNum);
                    break;
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("잘못된 입력입니다 : " + e.getMessage());
                sc.nextLine();
            }
        }
    }

    // 2. readOption(int bno)
    public void readOption(int bno) {
        System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴 선택: ");

        while (true) {
            String inputNum = sc.nextLine();
            if (inputNum.matches(readOptionRegex)) {
                switch (inputNum) {
                    case "1" -> update(bno);
                    case "2" -> delete(bno);
                    case "3" -> run();
                }
                break;
            } else System.out.println("[1-3]번 중 번호를 선택하세요.");
        }
    }

    // 2. read() - update
    public void update(int bno) {
        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        String newTitle = sc.nextLine();
        System.out.print("내용: ");
        String newContent = sc.nextLine();
        System.out.print("작성자: ");
        String newWriter = sc.nextLine();
        System.out.println("-".repeat(60));

        if (checkMenu()) {
            Board board = Board.builder()
                    .bno(bno)
                    .bWriter(newWriter)
                    .bTitle(newTitle)
                    .bContent(newContent)
                    .bDate(new Date())
                    .build();

            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(bno), board);
            boardManager.setBoardMap(boardMap);
        }

    }

    // 2. read() - delete
    public void delete(int bno) {
        int num = 1;
        size--;
        Map<String, Board> boardMap = boardManager.getBoardMap();
        Map<String, Board> newBoardMap = new HashMap<>();
        for (Map.Entry<String, Board> entry : boardMap.entrySet()) {
            String key = entry.getKey();
            Board board = entry.getValue();
            if (key.equals(String.valueOf(bno))) {
                continue;
            } else if (Integer.parseInt(key) < bno) {
                newBoardMap.put(key, board);
                num++;
            } else {
                newBoardMap.put(String.valueOf(num), board);
                board.setBno(num);
                num++;
            }
        }
        boardManager.setBoardMap(newBoardMap);




    }

    // 3. clear()
    public void clear() {
        System.out.println("*** clear() 메소드 실행됨");
        System.out.println();
        System.out.println("[게시물 전체 삭제]");
        System.out.println("-".repeat(60));

        if (checkMenu()) {
            boardManager.getBoardMap().clear();
            size = 1;
        }
        else System.out.println("잘못된 번호입니다.");
    }


}
