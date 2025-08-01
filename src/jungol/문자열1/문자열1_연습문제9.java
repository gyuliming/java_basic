package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            str = str.substring(1) + str.charAt(0);
            System.out.println(str);
        }

    }
}