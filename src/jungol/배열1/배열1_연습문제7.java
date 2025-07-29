package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제7 {

    public static void main(String[] args) {
        int odd, even;
        int oddMin = 0;
        int evenMax = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                even = arr[i];
                if (evenMax <= even) {
                    evenMax = even;
                }
            } else {
                odd = arr[i];
                if (oddMin >= odd) {
                    oddMin = odd;
                }
            }
        }
        System.out.printf("%d %d", oddMin, evenMax);

    }
}
