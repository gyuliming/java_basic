package jungol.반복제어문3;

import java.util.Scanner;

//#
//# #
//# # #
//  # #
//    #
public class 반복제어문3_형성평가9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //#
        //# #
        //# # #
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        //  # #
        //    #
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}