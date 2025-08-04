package javabasic_02.day09.oop;

import java.util.Arrays;

// 학생 인스턴스 생성을 위한 실행 클래스
public class StudentMain {

    public static void main(String[] args) {
        Student 경민 = new Student();
        Student 우혁 = new Student("강우혁", "12345");

        Student 형근 = new Student("김형근", 27, "경기도 의정부시", "1234567", new Integer[]{90, 90, 80});
        Student 기웅 = new Student("박기웅", 25, "서울시 강남구", "12345678", new Integer[]{100, 95, 85});

        System.out.println(경민.toString());
        System.out.println(우혁.toString());
        System.out.println(형근.toString());
        System.out.println(기웅.toString());
        System.out.println(기웅.getStu_name());
        System.out.println(기웅.getAddress());
        String 기웅주소 = 기웅.getAddress();
        System.out.println(기웅주소 + "에 살고 있습니다.");
        기웅.gender = "남자";
        경민.gender = "남자";
        System.out.println(기웅.gender);
        System.out.println(경민.gender);

        System.out.println("[국어, 영어, 수학] = " + Arrays.toString(형근.getScores()));
        System.out.println("[국어, 영어, 수학] = " + Arrays.toString(기웅.getScores()));
        System.out.println("총점 : " + 형근.getTotalScore());
        System.out.println("총점 : " +기웅.getTotalScore());
        System.out.printf("평균 : %.1f\n", 형근.getAverageScore());
        System.out.printf("평균 : %.1f\n", 기웅.getAverageScore());
    }
}



