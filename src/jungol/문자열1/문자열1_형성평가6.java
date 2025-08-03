package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_형성평가6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);

        do {
            int delIdx = sc.nextInt();
            if (delIdx > sb.length()) sb.deleteCharAt(sb.length() - 1);
            else sb.deleteCharAt(delIdx - 1);
            System.out.println(sb);
        } while (sb.length() != 1);

    }
}
