package javabasic_02.test.loop_array;

import java.util.Scanner;

public class JavaBasic8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        boolean step = true;

        while (step) {
            menu();
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    balance = deposit(sc, balance);
                    break;

                case 2:
                    balance = withdraw(sc, balance);
                    break;

                case 3:
                    checkBalance(balance);
                    break;

                case 4:
                    System.out.println("프로그램 종료");
                    step = false;
                    break;

                default:
                    System.out.println("1~4 숫자만 입력해주세요.");
                    System.out.println();
            }
        }


    }

    public static void menu() {
        System.out.println("-------------------------------------");
        System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
        System.out.println("-------------------------------------");
        System.out.print("선택>");
    }

    public static int deposit(Scanner sc, int balance) {
        System.out.print("예금액>");
        int money = sc.nextInt();
        balance += money;
        System.out.println();
        return balance;
    }

    public static int withdraw(Scanner sc, int balance) {
        System.out.print("출금액>");
        int money = sc.nextInt();

        if (money > balance) System.out.println("잔액이 부족합니다.");
        else balance -= money;

        System.out.println();
        return balance;
    }

    public static void checkBalance(int balance) {
        System.out.printf("잔고>%d\n", balance);
        System.out.println();
    }

}


