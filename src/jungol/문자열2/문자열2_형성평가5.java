package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }

        char ch = sc.next().charAt(0);
        String str = sc.next();

        boolean check = false;

        for (String word : words) {
            if (word.contains(String.valueOf(ch)) || word.contains(str)) {
                System.out.println(word);
                check = true;
            }
        }

        if (!check) System.out.println("none");

    }
}
