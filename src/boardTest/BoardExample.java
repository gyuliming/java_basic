package boardTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardExample {
    static Scanner sc = new Scanner(System.in);
    static List<Board> boards = new ArrayList<>(); // (Board) 글이 등록(저장)     공간 => 게시판
    static int nextBno = 1; // 번호
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd"); // 날짜 포매팅

    public static void main(String[] args) {
        BoardExample boardExample = new BoardExample();
        boardExample.list();
    }

    public static void list() {
        System.out.print("""
                [게시물 목록]
                -----------------------------------------------------------------
                no\t\twriter\t\tdate\t\t\ttitle
                -----------------------------------------------------------------
                """);

        for (Board board : boards) {
            System.out.printf("%d\t\t%s\t\t%s\t\t\t%s\n", board.getBno(), board.getBwriter(), sdf.format(board.getBdate()), board.getBtitle());
        }

        mainMenu();
    }

    public static void mainMenu() {
        try {
            System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
            System.out.print("메뉴 선택: ");
            String menuNo = sc.nextLine();
            switch (menuNo) {
                case "1" -> create();
                case "2" -> read();
                case "3" -> clear();
                case "4" -> exit();
                default -> {
                    System.out.println("숫자를 잘못 입력하셨습니다.");
                    mainMenu();
                }
            }
        } catch (RuntimeException e) {
            e.getMessage();
        } catch (Exception e1) {
            e1.getMessage();
        }
    }

    // 1. create()
    public static void create() {
        System.out.println("[새 게시물 입력]");
        Board board1 = new Board();
        board1.setBno(nextBno++);

        System.out.print("제목: ");
        board1.setBtitle(sc.nextLine());

        System.out.print("내용: ");
        board1.setBcontent(sc.nextLine());

        System.out.print("작성자: ");
        board1.setBwriter(sc.nextLine());

        board1.setBdate(new Date());

        System.out.println("-----------------------------------------------------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine();

        if (menuNo.equals("1")) boards.add(board1);
        else nextBno--;
        list();
    }

    // 2. read()
    public static void read() {
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int bno = sc.nextInt();
        sc.nextLine();

        Board choice = null;
        for (Board board : boards) {
            if (board.getBno() == bno) {
                choice = board;
                break;
            }
        }

        if (choice != null) {
            System.out.println("#############");
            System.out.printf("번호: %d\n", choice.getBno());
            System.out.printf("제목: %s\n", choice.getBtitle());
            System.out.printf("내용: %s\n", choice.getBcontent());
            System.out.printf("작성자: %s\n", choice.getBwriter());
            System.out.printf("날짜: %s\n", sdf.format(choice.getBdate()));
            System.out.println("#############");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
            System.out.print("메뉴 선택: ");
            String menuNo = sc.nextLine();

            switch (menuNo) {
                case "1" -> update(bno);
                case "2" -> delete(bno);
                case "3" -> list();
            }

        } else System.out.println("해당하는 번호가 없습니다.");

        list();
    }

    // 3. clear()
    public static void clear() {
        System.out.println("게시물 전체를 삭제합니다.");
        boards.clear();
        list();
    }

    // 4. exit()
    public static void exit() {
        System.out.println("게시판을 종료합니다.");
    }

    // 2. read() - update
    public static void update(int bno) {
        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        String newTitle = sc.nextLine();
        System.out.print("내용: ");
        String newContent = sc.nextLine();
        System.out.print("작성자: ");
        String newWriter = sc.nextLine();

        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine();

        if (menuNo.equals("1")) {
            for (Board board : boards) {
                if (board.getBno() == bno) {
                    board.setBtitle(newTitle);
                    board.setBcontent(newContent);
                    board.setBwriter(newWriter);
                }
            }
        }
        list();
    }

    // 2. read() - delete
    public static void delete(int bno) {
        boards.remove(bno - 1);

        for (int i = 0; i < boards.size(); i++) {
            boards.get(i).setBno(i + 1);
        }

        nextBno = boards.size() + 1;

        list();
    }


}
