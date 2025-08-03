package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_형성평가3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();

        for (char c : arr) {
            if (Character.isLetterOrDigit(c)) {
                c = Character.toLowerCase(c);
                System.out.print(c);
            }
        }

    }
}
