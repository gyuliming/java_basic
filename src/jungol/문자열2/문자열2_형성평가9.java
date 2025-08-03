package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;

        int num1 = sc.nextInt();
        String str1 = String.valueOf(num1);

        double num2 = sc.nextDouble();
        String str2 = String.format("%.3f", num2);

        String str3 = sc.next();

        String result = str1 + str2 + str3;

        if (result.length() % 2 == 0) len = result.length() / 2;
        else len = result.length() / 2 + 1;

        System.out.println(result.substring(0, len));
        System.out.println(result.substring(len));

    }
}
