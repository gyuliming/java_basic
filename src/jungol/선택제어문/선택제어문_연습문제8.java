package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float score;

        score = sc.nextFloat();

        switch ((int)score) {
            case 4:
                System.out.println("scholarship");
                break;
            case 3:
                System.out.println("next semester");
                break;
            case 2:
                System.out.println("seasonal semester");
                break;
            default:
                System.out.println("retake");
        }
    }
}