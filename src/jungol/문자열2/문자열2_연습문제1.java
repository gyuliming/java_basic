package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }

        // 출력
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
