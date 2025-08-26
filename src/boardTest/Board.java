package boardTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

// 도메인
// 하나의 글을 저장하는 객체
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int bno; // 글 번호
    private String bTitle; // 글 제목
    private String bContent; // 글 내용
    private String bWriter; // 글쓴이
    private Date bDate; // 글쓴 날짜

}
