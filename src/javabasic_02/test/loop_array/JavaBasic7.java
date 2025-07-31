package javabasic_02.test.loop_array;

public class JavaBasic7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("@");
            }
            System.out.println();
        }

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            } // 1 -> 3, 2 -> 1
            for (int k = 5; k > 2 * i; k--) {
                System.out.print("@");
            }
            System.out.println();
        }



    }
}
