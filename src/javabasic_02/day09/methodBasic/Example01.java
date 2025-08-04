package javabasic_02.day09.methodBasic;

import java.util.Scanner;

public class Example01 {
    static Scanner sc = new Scanner(System.in);

    public static void method() {
        System.out.println("method() 시작");
//        System.out.println("static 메서드입니다.");
//        System.out.println(5 + 6);
        System.out.println("method() 끝");
    }

    public static void main(String[] args) {
//        method(); 정적(static) 메서드 호출
        int counter = 0;
        System.out.print("몇번을 수행할까요? ");
        counter = sc.nextInt();

        // 5번 호출
        for (int i = 0; i < counter; i++) {
            System.out.println(i + 1 + "번째 호출");
            method();
        }

        System.out.println("원하는만큼 method() 호출 후 여기로 돌아옵니다.");

    }
}
