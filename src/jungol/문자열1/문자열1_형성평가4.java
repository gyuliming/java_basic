package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_형성평가4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char ch = sc.next().charAt(0);

        int idx = word.indexOf(ch);
        if (idx != -1) System.out.println(idx);
        else System.out.println("No");
    }
}
