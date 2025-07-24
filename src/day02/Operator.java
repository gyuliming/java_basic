package day02;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor, eng, avg;
        kor = sc.nextInt();
        eng = sc.nextInt();
        avg = (kor + eng) / 2;

        System.out.printf("총점:%d\n", kor+eng);
        System.out.printf("평균:%d", avg);
    }
}
