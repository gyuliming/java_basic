package jungol.반복제어문3;


public class 반복제어문3_연습문제7 {

    public static void main(String[] args) {

        int n = 96;
        int num = 0;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                n++;
                System.out.print((char)n + " ");
            }
            for (int k = 5; k > i; k--) {
                num++;
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
