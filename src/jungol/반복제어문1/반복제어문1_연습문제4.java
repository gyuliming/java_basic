package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        int total = 0;
        double avg;

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            count++;
            total += num;

        }
        avg = (double) total / count;

        System.out.printf("입력된 자료의 개수 = %d\n", count);
        System.out.printf("입력된 자료의 합계 = %d\n", total);
        System.out.printf("입력된 자료의 평균 = %.2f", avg);
    }
}