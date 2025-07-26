package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor, eng, math, com, sum, avg;

        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();
        com = sc.nextInt();

        sum = kor + eng + math + com;
        avg = sum / 4;

        System.out.printf("sum %d\navg %d", sum, avg);
    }
}