package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        for (String s : arr) {
            System.out.println(s);
        }

    }
}