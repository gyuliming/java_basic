package jungol.반복제어문3;

import java.util.Scanner;

//*****
// ***
//  *
// ***
//*****
public class 반복제어문3_형성평가4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //*****
        // ***
        //  *
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 2 * n ; j >= 2 * i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ***
        //*****
        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}