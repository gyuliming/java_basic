package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            count++;
            if (arr[i] == 999) break;
        }

        int max = arr[0];
        int min = arr[0];

        for (int j = 0; j < count - 1; j++) {
            max = Math.max(max, arr[j]);
            min = Math.min(min, arr[j]);
        }

        System.out.printf("max : %d\nmin : %d", max, min);
    }
}