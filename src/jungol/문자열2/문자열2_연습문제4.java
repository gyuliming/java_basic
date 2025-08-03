package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = sc.nextLine().split(" ");

        String first = arr[0];
        String second = arr[1];

        if (first.length() > second.length()) {
            System.out.println(second);
            System.out.println(first);
        } else if (first.length() < second.length()) {
            System.out.println(first);
            System.out.println(second);
        } else {
            System.out.println(first);
            System.out.println(second);
        }

    }
}
