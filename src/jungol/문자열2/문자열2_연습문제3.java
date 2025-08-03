package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = {"champion", "class"};

        System.out.print("문자를 입력하세요. ");
        char ch = sc.next().charAt(0);

        for (String s : arr) {
            if (s.charAt(0) == ch) {
                System.out.println(s);
            } else System.out.println("찾는 단어가 없습니다.");
        }

    }
}
