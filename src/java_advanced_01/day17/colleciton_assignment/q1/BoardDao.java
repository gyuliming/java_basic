package java_advanced_01.day17.colleciton_assignment.q1;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    public BoardDao() {}

    public List<Board> getBoardList() {
        List<Board> lists = new ArrayList<>();
        lists.add(new Board("제목1", "내용1"));
        lists.add(new Board("제목2", "내용2"));
        lists.add(new Board("제목3", "내용3"));

        return lists;
    }
}
