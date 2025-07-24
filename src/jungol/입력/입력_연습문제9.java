package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1, d2;

        System.out.println("두 개의 실수를 입력하시오.");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();

        System.out.printf("x = %.2f\ny = %.2f", d1, d2);

    }
}
