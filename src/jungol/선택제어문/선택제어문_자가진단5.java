package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        if (num1 >= 4.0 & num2 >= 4.0) {
            System.out.println("A");
        } else if (num1 >= 3.0 & num2 >= 3.0) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
