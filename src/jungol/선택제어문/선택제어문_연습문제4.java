package jungol.선택제어문;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("점수를 입력하세요. ");
            int score = sc.nextInt();

            if (score >= 90 && score <= 100) {
                System.out.println("A");
            } else if (score >= 80 && score < 90) {
                System.out.println("B");
            } else if (score >= 70 && score < 80) {
                System.out.println("C");
            } else if (score >= 60 && score < 70) {
                System.out.println("D");
            } else if (score >=0 && score < 60) {
                System.out.println("F");
            } else {
                System.out.println("0부터 100사이의 숫자를 입력해주세요.");
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력이 가능합니다.");
        }


    }
}