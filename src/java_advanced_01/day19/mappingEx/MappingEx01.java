package java_advanced_01.day19.mappingEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
class Student {
    private String name;
    private int score;
}

public class MappingEx01 {

    public static void main(String[] args) {
        // 학생 3명을 리스트 컬렉션을 생성하여 순서대로 저장
        List<Student> studentList = Arrays.asList(
                new Student("학생1", 90),
                new Student("학생2", 80),
                new Student("학생3", 70)
        );

        // 학생들의 점수(score)를 stream() 방법으로 출력
        studentList.stream()
                .mapToInt(student -> student.getScore())
                .forEach(System.out::println);

        // 학생들의 총점 출력
        int sum = studentList.stream()
                .mapToInt(student -> student.getScore())
                .sum();
        System.out.println(sum);

        // 학생들의 평균 출력 (소수 첫째까지)
        double avg = studentList.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.printf("%.1f", avg);
    }
}
