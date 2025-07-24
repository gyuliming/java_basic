package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, max;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
    }
}