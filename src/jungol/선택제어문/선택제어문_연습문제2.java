package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2)
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.", num1, num2);
        else
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.", num2, num1);
    }
}
