package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            count++;

            if (arr[i] == -1) {
                count--;
                break;
            }
        }

        int diff = Math.min(3, count);

        for (int i = count - diff; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}