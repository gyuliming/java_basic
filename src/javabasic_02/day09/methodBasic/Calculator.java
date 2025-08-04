package javabasic_02.day09.methodBasic;

import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("""
                ================================================
                                사칙연산 계산기
                ================================================
                1. 덧셈   2. 뺄셈   3. 곱셈   4. 나눗셈  5. 종료
                
                두 수를 차례로 입력하고 사칙연산의 메뉴 숫자를 입력해 주세요.
                """);
    }

    public static int adder(int num1, int num2) {
        System.out.printf("결과는 %d + %d = ", num1, num2);
        return num1 + num2;
    }

    public static int minus(int num1, int num2) {
        System.out.printf("결과는 %d - %d = ", num1, num2);
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        System.out.printf("결과는 %d * %d = ", num1, num2);
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        System.out.printf("결과는 %d / %d = ", num1, num2);
        return (double) num1 / (double) num2;
    }

    public static void exit() {
        System.out.println("프로그램을 종료합니다.");
    }

    public static void main(String[] args) {
        boolean loop = true;

        while (loop) {
            menu();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int input = sc.nextInt();

            switch (input) {
                case 1 -> System.out.println(adder(num1, num2));
                case 2 -> System.out.println(minus(num1, num2));
                case 3 -> System.out.println(multi(num1, num2));
                case 4 -> System.out.printf("%.1f", division(num1, num2));
                case 5 -> {
                    exit();
                    loop = false;
                }
                default -> System.out.println("1~5까지의 숫자만 입력해주세요.");
            }
        }

    }
}