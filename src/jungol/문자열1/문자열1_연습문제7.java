package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        for (char c : arr) {
            if (Character.isLowerCase(c)) System.out.print(Character.toUpperCase(c));
            else if (Character.isUpperCase(c)) System.out.print(Character.toLowerCase(c));
            else System.out.print(c);
        }

    }
}