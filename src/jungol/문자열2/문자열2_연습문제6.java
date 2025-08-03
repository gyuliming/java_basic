package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();

        str2 = str2 + str1.substring(0,3);
        str1 = str2.substring(0, 3) + str1.substring(3);

        System.out.println(str1);
        System.out.println(str2);
    }
}
