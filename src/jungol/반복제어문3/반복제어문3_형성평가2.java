package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            n = sc.nextInt();

            if (1 <= n && n <= 100) {
                break;
            }
            System.out.println("1부터 100까지만 입력해주세요.");
        }

        for (int i = n; i < 100; i = i + n) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                break;
            }
        }


    }
}
