package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
