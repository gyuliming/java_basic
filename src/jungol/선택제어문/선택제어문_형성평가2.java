package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
    }
}