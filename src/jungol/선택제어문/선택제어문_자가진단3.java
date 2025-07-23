package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, result;
        age = sc.nextInt();
        result = 20 - age;

        if (age > 20) {
            System.out.println("adult");
        } else {
            System.out.printf("%d years later", result);
        }
    }
}
