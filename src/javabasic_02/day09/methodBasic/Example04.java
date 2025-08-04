package javabasic_02.day09.methodBasic;

import java.util.Scanner;

public class Example04 {
    static Scanner sc = new Scanner(System.in);

    public static int division(int num1, int num2) {
        int result = 0;
        if (num2 != 0) {
            result = num1 / num2;
        } else System.out.println("0으로 나누기 금지");

        return result;
    }

    public static void main(String[] args) {
        System.out.println("두 수를 차례로 입력해주시면 나누기 결과를 제공해드립니다.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = division(n1, n2);
        System.out.println(result);
    }
}
