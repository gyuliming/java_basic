package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int input;

        while (true) {
            input = sc.nextInt();
            if (input == 0) break;

            arr[input % 10]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.printf("%d : %d개\n", i, arr[i]);
            }
        }

    }
}