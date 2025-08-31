package Team_mission_v1;

import lombok.*;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private List<Integer> record; // 과목 점수: Integer
    private int total;
    private double average;
    private String grade;

    public Student(String name, List<Integer> record) {
        this.name = name;
        this.record = record;
        calculate();
    }

    private void calculate() {
        this.total = record.stream().mapToInt(Integer::intValue).sum();
        this.average = total / (double) record.size();
        if (average >= 90) this.grade = "A";
        else if (average >= 80) this.grade = "B";
        else this.grade = "C";
    }

    @Override
    public String toString() {
        return String.format("=> 저장됨: %s (총점=%d, 평균=%.1f, 학점=%s)\n", getName(), getTotal(), getAverage(), getGrade());
    }
}

