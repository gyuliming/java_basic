package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
