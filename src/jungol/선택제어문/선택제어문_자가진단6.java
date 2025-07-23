package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s;
        int age;

        s = sc.next().charAt(0);
        age = sc.nextInt();

        if (s == 'M')
            if (age >= 18) {
                System.out.println("MAN");
            } else System.out.println("BOY");
        else {
            if (age >= 18) {
                System.out.println("WOMAN");
            } else System.out.println("GIRL");
        }
    }
}