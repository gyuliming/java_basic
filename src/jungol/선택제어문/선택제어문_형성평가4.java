package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number? ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("dog");
                break;
            case 2:
                System.out.println("cat");
                break;
            case 3:
                System.out.println("chick");
                break;
            default:
                System.out.println("I don't know.");
        }
    }
}