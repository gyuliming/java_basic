package jungol.반복제어문1;

import java.util.Scanner;


public class 반복제어문1_형성평가3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        int count = 0;
        double avg;

        while (true) {
            num = sc.nextInt();

            if (num < 0 || num > 100) {
                break;
            }

            sum += num;
            count += 1;
        }
        avg = (double) sum / count;
        System.out.printf("sum : %d\navg : %.1f", sum, avg);
    }
}