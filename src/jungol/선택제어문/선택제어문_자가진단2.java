package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, weight, bmi;

        height = sc.nextInt();
        weight = sc.nextInt();
        bmi = weight + 100 - height;

        System.out.println(bmi);

        if (bmi > 0) {
            System.out.println("Obesity");
        }
    }
}
