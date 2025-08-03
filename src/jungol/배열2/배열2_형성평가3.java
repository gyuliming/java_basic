package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int first = sc.nextInt();
        int second = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            switch (i) {
                case 0: arr[i] = first;
                        break;
                case 1: arr[i] = second;
                        break;
                default: arr[i] = (arr[i - 2] + arr[i - 1]) % 10;
                         break;
            }
            System.out.print(arr[i] + " ");
        }

    }
}