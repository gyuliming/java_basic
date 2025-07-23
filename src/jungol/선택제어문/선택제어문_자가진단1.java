package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        if (num > 0) {
            System.out.println(num);
        }
        else {
            System.out.println(num);
            System.out.println("minus");
        }
    }
}
