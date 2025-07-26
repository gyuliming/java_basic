package jungol.반복제어문1;

import java.util.Scanner;


public class 반복제어문1_형성평가2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int odd = 0;
        int even = 0;

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.printf("odd : %d\neven : %d", odd, even);

    }
}