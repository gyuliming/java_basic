package day02;

import java.util.Scanner;

public class FourArithmetic { // 클래스 표기 : 파스칼 표기법, 변수나 메소드 표기 : 카멜, 스네이크 표기법 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("%d+%d=%d\n", a, b, a+b);
        System.out.printf("%d-%d=%d\n", a, b, a-b);
        System.out.printf("%d*%d=%d\n", a, b, a*b);
        System.out.printf("%d/%d=%d\n", a, b, a/b);
    }
}
