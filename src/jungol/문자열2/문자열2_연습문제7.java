package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words =  {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};
        boolean found = false;

        System.out.print("문자를 입력하세요. ");
        char ch = sc.next().charAt(0);
        for (String word : words) {
            if (word.contains(String.valueOf(ch))) {
                System.out.println(word);
                found = true;
            }
        }
        if (!found) System.out.println("찾는 단어가 없습니다.");

        found = false;

        System.out.print("\n문자열을 입력하세요. ");
        String str  = sc.next();
        for (String word : words) {
            if (word.contains(str)) {
                System.out.println(word);
                found = true;
            }
        }
        if (!found) System.out.println("찾는 단어가 없습니다.");

    }
}