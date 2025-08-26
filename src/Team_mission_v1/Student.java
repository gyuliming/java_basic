package Team_mission_v1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Student implements Serializable {
    private static final long serialVersionUID = 1;
    private String name;
    private int[] record; // 과목 점수 배열, 길이 4로 보임
    private int total;
    private float average;
    private String grade;

}
