package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char word = sc.nextLine().charAt(0);

        switch(word) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Usually");
                break;
            case 'D':
                System.out.println("Effort");
                break;
            case 'F':
                System.out.println("Failure");
                break;
            default:
                System.out.println("error");
        }
        sc.close();
    }
}