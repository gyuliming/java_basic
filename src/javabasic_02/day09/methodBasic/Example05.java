package javabasic_02.day09.methodBasic;

import java.util.Scanner;

public class Example05 {
    static Scanner sc = new Scanner(System.in);

    public static void idPwPrint(String id, String pwd) {
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + pwd);
    }

    public static void main(String[] args) {
        System.out.println("아이디를 입력해주세요.");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요.");
        String pwd = sc.nextLine();

        idPwPrint(id, pwd);
    }
}
