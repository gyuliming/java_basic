package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int [5];

        System.out.print("5개의 수를 입력하시오. ");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        System.out.printf("%d %d %d %d %d", num[0] + 3, num[1] - 3, num[2] * 3, num[3] / 3 , num[4] % 3);

    }
}
