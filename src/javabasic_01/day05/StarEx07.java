package javabasic_01.day05;

//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

public class StarEx07 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 9; j > 2 * i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
