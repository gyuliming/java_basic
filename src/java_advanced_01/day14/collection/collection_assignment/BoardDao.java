package java_advanced_01.day14.collection.collection_assignment;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    BoardDao() {}

    public List<Board> getBoardList() {
        List<Board> dao = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Board bd = new Board("제목" + i, "내용" + i);
            dao.add(bd);
        }
        return dao;
    }

}
