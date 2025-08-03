package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence = sc.nextLine();
        String[] arr = sentence.split(" ");

        for (String s : arr) {
            System.out.println(s);
        }

    }
}
