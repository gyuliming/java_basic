package jungol.문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_형성평가4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] words = new String[num];

        for (int i = 0; i < num; i++) {
            words[i] = sc.next();
        }

        Arrays.sort(words);

        Arrays.stream(words).forEach(System.out::println);

    }
}
