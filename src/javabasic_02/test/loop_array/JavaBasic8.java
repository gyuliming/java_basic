package javabasic_02.test.loop_array;

import java.util.Scanner;

public class JavaBasic8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0; // 잔고
        boolean step = true; // while문 조건

        while (step) {
            menu(); // 메뉴 호출
            String input = sc.nextLine(); // 번호 선택

            switch (input) {
                // 1번 선택 -> deposit 메소드 호출
                case "1":
                    balance = deposit(sc, balance);
                    break;

                // 2번 선택 -> withdraw 메소드 호출
                case "2":
                    balance = withdraw(sc, balance);
                    break;

                // 3번 선택 -> checkBalance 메소드 호출
                case "3":
                    checkBalance(balance);
                    break;

                // 4번 선택 -> 프로그램종료
                case "4":
                    System.out.println("프로그램 종료");
                    step = false;
                    break;

                default:
                    System.out.println("1~4 숫자만 입력해주세요.");
                    break;
            }

        }
    }

    // 메뉴 메소드
    public static void menu() {
        System.out.println("-------------------------------------");
        System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
        System.out.println("-------------------------------------");
        System.out.print("선택>");
    }

    // 예금 메소드
    public static int deposit(Scanner sc, int balance) {
        System.out.print("예금액>");
        int money = sc.nextInt();
        sc.nextLine();
        balance += money;
        System.out.println();
        return balance;
    }

    // 출금 메소드
    public static int withdraw(Scanner sc, int balance) {
        System.out.print("출금액>");
        int money = sc.nextInt();
        sc.nextLine();

        if (money > balance) System.out.println("잔액이 부족합니다.");
        else balance -= money;

        System.out.println();
        return balance;
    }

    // 잔고 확인 메소드
    public static void checkBalance(int balance) {
        System.out.printf("잔고>%d\n", balance);
        System.out.println();
    }

}
