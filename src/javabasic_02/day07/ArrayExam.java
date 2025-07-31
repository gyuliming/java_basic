package javabasic_02.day07;

import java.util.Arrays;

public class ArrayExam {
    public static void main(String[] args) {
        // 대문자 -> 소문자
        char[] c = {'A', 'P', 'P', 'L', 'E'};

        c[0] = 97;
        c[1] = 112;
        c[2] = 112;
        c[3] = 108;
        c[4] = 101;

        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];
            System.out.print(c1);
        }

        System.out.println();

        char c1 = Character.toUpperCase('a');
        System.out.println(c1);

        for (char c2 : c) {
//            System.out.print(String.valueOf(c2).toLowerCase()); char -> String -> lower
            System.out.print(Character.toLowerCase(c2)); // char -> lower
        }

    }
}
