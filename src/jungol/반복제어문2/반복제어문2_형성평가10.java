package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int start = num1;
        int end = num2;
        int step = 1;

        if (num1 > num2) {
            step = -1;
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = start; (step > 0 ? j <= end : j >= end); j += step) {
                System.out.printf("%d * %d = %2d%3s", j, i, i * j, "");
            }
            System.out.println();
        }

    }
}
