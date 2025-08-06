package javabasic_02.day10.morningtest;

import java.util.Scanner;

public class BankApplication {
    static Scanner sc = new Scanner(System.in);
    static Account[] accounts = new Account[100];
    static boolean run = true;
    static int accCount = 0;

    public static void menu() {
        System.out.print("""
                    =======================================================
                    1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
                    =======================================================
                    """);
        System.out.print("선택> ");
    }


    // 1. 계좌 성생 기능 : private static void createAccount()
    private static void createAccount() {
        System.out.print("""
                ----------
                계좌생성
                ----------
                """);
        System.out.print("계좌번호 : ");
        String accountNo = sc.nextLine();
        System.out.print("계좌주 : ");
        String owner = sc.nextLine();
        System.out.print("초기 입금액 : "); // 계산을 위해서 정수로 형변환
        int balance = Integer.parseInt(sc.nextLine());

        if (balance < 0) {
            System.out.println("정확한 금액을 입력해주세요.");
            return;
        }

        // 새로운 계좌 생성
        Account newAccount = new Account(accountNo, owner, balance);
        accounts[accCount] = newAccount;
        accCount++;

        System.out.println("결과 : 계좌가 생성되었습니다.");
    }


    // 2. 계좌 목록 보기 기능 : private static void accountList()
    private static void accountList() {
        System.out.print("""
                ----------
                계좌목록
                ----------
                """);

        // 개설 계좌 보기
        for (int i = 0; i < accCount; i++) {
            System.out.printf("%10s%10s%10d\n",
                    accounts[i].getAccountNo(), accounts[i].getOwner(), accounts[i].getBalance());
        }
    }


    // 3. 예금 기능 : private static void deposit()
    private static void deposit() {
        System.out.print("""
                ----------
                예금
                ----------
                """);

        System.out.print("계좌번호 : ");
        String accountNum = sc.nextLine();

        Account account = findAccount(accountNum);
        if (account == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("예금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        if (money < 0) {
            System.out.println("정확한 금액을 입력해주세요.");
            return;
        }

        account.setBalanceDeposit(money);
    }


    // 4. 출금 기능 : private static void withdraw()
    private static void withdraw() {
        System.out.print("""
                ----------
                출금
                ----------
                """);

        System.out.print("계좌번호 : ");
        String accountNum = sc.nextLine();

        Account account = findAccount(accountNum);
        if (account == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("출금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        if (money < 0) {
            System.out.println("정확한 금액을 입력해주세요.");
            return;
        }

        if (account.getBalance() < money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        account.setBalanceWithdraw(money);
    }

    // 5. 프로그램 종료 기능 :
    public static void exit() {
        System.out.print("""
                ----------
                종료
                ----------
                """);
        run = false;
    }


    private static Account findAccount(String accountNum) {
        for (int i = 0; i < accCount; i++) {
            if (accounts[i].getAccountNo().equals(accountNum)) {
                return accounts[i];
            }
        }
        return null;
    }


    // BankApplication 시작
    public static void main(String[] args) {

        while (run) {
            try {
                menu();
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1 -> createAccount();
                    case 2 -> accountList();
                    case 3 -> deposit();
                    case 4 -> withdraw();
                    case 5 -> exit();
                    default -> System.out.println("1~5의 숫자만 입력해주세요.");
                }
            } catch (Exception e) {
                System.out.println("숫자만 입력해주세요.");
            }
        }

    }
}
