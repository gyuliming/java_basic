package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String str4 = sc.next();

        System.out.printf("%s + %s = %d\n", str1, str2, Integer.parseInt(str1) + Integer.parseInt(str2));
        System.out.printf("%.2f + %.2f = %.2f", Double.parseDouble(str3), Double.parseDouble(str4),
                Double.parseDouble(str3) + Double.parseDouble(str4));
    }
}