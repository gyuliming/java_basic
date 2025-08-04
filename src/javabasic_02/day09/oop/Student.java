package javabasic_02.day09.oop;

import java.util.Arrays;

public class Student {
    // Student 멤버(필드)
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssn;
    String gender;
    private Integer[] stu_scores;

    // 생성자를 통하여 학생의 객체의 필드를 초기화
    Student() { } // 기본 생성자

    Student(String stu_name, String stu_ssn) {
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;

    }

    Student(String stu_name, Integer stu_age, String address, String stu_ssn, Integer[] stu_scores) {
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.address = address;
        this.stu_ssn = stu_ssn;
        this.stu_scores = stu_scores;
    }


    public String getStu_name() {
        return stu_name;
    }

    public Integer getStu_age() {
        return this.stu_age;
    }

    public String getAddress() {
        return address;
    }

    public String getStu_ssn() {
        return stu_ssn;
    }

    public Integer[] getScores() {
        return stu_scores;
    }

    // stu_scores[0] : 국어, stu_scores[1] : 영어, stu_scores[2] : 수학
    public Integer getTotalScore() {
        return stu_scores[0] + stu_scores[1] + stu_scores[2];
    }

    public double getAverageScore() {
        return getTotalScore() / (double) stu_scores.length;
    }


    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", stu_ssn='" + stu_ssn + '\'' +
                ", stu_scores='" + Arrays.toString(stu_scores) + '\'' +
                '}';
    }

}
