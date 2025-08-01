package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "jungol olympiad";
        int n;

        for (int i = 1; i <= 5; i++) {
            n = sc.nextInt();
            System.out.print(str.charAt(n));
        }

    }
}