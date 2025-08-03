package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"flower", "rose", "lily", "daffodil", "azalea"};

        char input = sc.next().charAt(0);
        int count = 0;

        for (String word : words) {
            for (int j = 1; j < 3; j++) {
                if (input == word.charAt(j)) {
                    System.out.println(word);
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
