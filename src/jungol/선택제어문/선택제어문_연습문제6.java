package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, max;

        System.out.print("세 수를 입력하세요. ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        max = num1;

        if (max < num2) {
            max = num2;
            if (max < num3) {
                max = num3;
            }
        } else if (max < num3) {
            max = num3;
        } else {
            max = num1;
        }

        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", max);
    }
}