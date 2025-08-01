package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char ch = sc.next().charAt(0);
            System.out.printf("%c -> %d\n", ch, (int) ch);

            if (ch == '0') break;
        }

    }
}