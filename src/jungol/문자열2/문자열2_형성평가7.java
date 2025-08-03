package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = Integer.parseInt(str1.replaceAll("[^0-9].*",""));
        int num2 = Integer.parseInt(str2.replaceAll("[^0-9].*",""));

        System.out.println(num1 * num2);

    }
}
