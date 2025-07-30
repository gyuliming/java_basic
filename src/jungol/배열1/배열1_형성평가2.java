package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) sum += arr[i];
        }

        System.out.println(sum);

    }
}
