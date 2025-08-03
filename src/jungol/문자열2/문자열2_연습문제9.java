package jungol.문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_연습문제9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("단어 5개를 입력하세요.");

        String[] words = new String[5];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();
        }

        Arrays.sort(words);

        for (String word : words) {
            System.out.println(word);
        }


    }
}