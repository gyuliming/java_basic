package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, avg;
        int count = 0;
        int total = 0;

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 1) {
                total += num;
                count++;
            }

        }
        avg =  total / count;

        System.out.printf("홀수의 합 = %d\n", total);
        System.out.printf("홀수의 평균 = %d", avg);
    }
}