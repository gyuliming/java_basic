package jungol.반복제어문3;

import java.util.Scanner;

//1 2 3
//  4 5
//    6
public class 반복제어문3_형성평가8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = n; k >= i; k--) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

    }
}