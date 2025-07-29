package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int oddValue = 1;
        // 1 3 5 7 9 1 3 5 7 9 ...
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (oddValue < 9) {
                    System.out.printf("%-2d", oddValue);
                    oddValue += 2;
                } else {
                    System.out.printf("%-2d", oddValue);
                    oddValue %= 2;
                }
            }
            System.out.println();
        }
    }
}