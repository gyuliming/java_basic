package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;

        do {
            count++;
            sum += count;
        } while (num > sum);

        System.out.println(count + " " + sum);

    }
}
