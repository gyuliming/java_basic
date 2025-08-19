package boardTest;

import lombok.Data;

import java.util.Date;

@Data
public class Board {
    private int bno; // 글 번호
    private String btitle; // 글 제목
    private String bcontent; // 글 내용
    private String bwriter; // 글쓴이
    private Date bdate; // 글쓴 날짜

    public Board() {}

    public Board(int bno, String btitle, String bcontent, String bwriter, Date bdate) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
        this.bdate = bdate;
    }
}
