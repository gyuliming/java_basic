package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.print((a > b ? 1 : 0) + " ");
        System.out.print((b >= c ? 1 : 0) + " ");
        System.out.print((a <= b ? 1 : 0) + " ");
        System.out.print((b < c ? 1 : 0));

    }
}
