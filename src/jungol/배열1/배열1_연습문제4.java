package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
        }

        for (int j = 1; j < arr.length; j+=2) {
            if (arr[j] == 0) {
                break;
            }
            System.out.printf("%d ", arr[j]);
        }
    }
}
