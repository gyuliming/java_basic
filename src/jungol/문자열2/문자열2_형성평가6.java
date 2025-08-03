package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int num = sc.nextInt();

        A = A + B;
        int len = Math.min(num, B.length());
        B = A.substring(0, num) + B.substring(len);
        System.out.printf("%s\n%s", A, B);

    }
}
