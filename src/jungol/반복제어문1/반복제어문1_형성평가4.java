package jungol.반복제어문1;

import java.util.Scanner;


public class 반복제어문1_형성평가4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;

        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 3 != 0 && num % 5 != 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}