package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
                oddSum += arr[i];
            } else {
                evenSum += arr[i];
            }
        }

        System.out.printf("odd : %d\neven : %d", oddSum, evenSum);
    }
}
