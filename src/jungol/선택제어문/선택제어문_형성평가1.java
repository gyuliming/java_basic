package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, max, min;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        System.out.println(max - min);
    }
}