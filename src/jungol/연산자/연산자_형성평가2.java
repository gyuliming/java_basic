package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1, d2;

        d1 = sc.nextInt();
        d2 = sc.nextInt();

        System.out.printf("%d / %d = %d...%d", d1, d2, d1 / d2, d1 % d2);

    }
}