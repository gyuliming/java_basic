package javabasic_01.day01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // 3개의 정수를 입력받아 3개의 정수의 합을 출력하세요
        int num1, num2, num3, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요");
        num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요");
        num2 = sc.nextInt();
        System.out.println("세 번째 숫자를 입력하세요");
        num3 = sc.nextInt();

        sum = num1 + num2 + num3;

        System.out.println("-----출력 결과-----");
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
        System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum); // 자바에서 제공해주는 기능(=API)
    }
}
