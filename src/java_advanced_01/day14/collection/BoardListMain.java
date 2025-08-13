package java_advanced_01.day14.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardListMain {

    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>(); // 순서 O, 중복 O

        // 글 하나를 작성하여 게시판에 올린다.
        boardList.add(new Board("컬렉션 학습 첫째날", "쉽지 않음", "sgl"));
        boardList.add(new Board("컬렉션 학습 둘째날", "쉽지 않음", "sgl"));
        boardList.add(new Board("컬렉션 학습 셋째날", "쉽지 않음", "sgl"));
        boardList.add(new Board("컬렉션 학습 넷째날", "쉽지 않음", "sgl"));

        // 현재 게시판의 글의 수
        int size = boardList.size();
        System.out.println("전체 글 수 : " + size);
        for (Board board : boardList) {
            System.out.printf("제목 : %s\n내용 : %s\n작성자 : %s\n", board.getSubject(),  board.getContent(), board.getWriter());
            System.out.println("------------------------------");
        }

        // 특정 인덱스의 객체 가져오기
        Board board = boardList.get(2);
        System.out.printf("제목 : %s\n내용 : %s\n작성자 : %s\n", board.getSubject(),  board.getContent(), board.getWriter());
        System.out.println("------------------------------");

        boardList.remove(2); // 2번 인덱스에 해당하는 값 삭제 -> 3번 인덱스에 해당하는 값이 2번 인덱스로 이동
        Board board1 = boardList.get(2);
        System.out.printf("제목 : %s\n내용 : %s\n작성자 : %s\n", board1.getSubject(),  board1.getContent(), board1.getWriter());
    }
}
