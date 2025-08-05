package javabasic_02.day10.morningtest;

public class Account {
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;
    private String accountNo; // 계좌번호
    private String owner; // 소유자
    private int balance; // 통장잔고

    Account() {}

    // 은행에 가서 계좌 개설 신청을 하면 개인정보를 은행에 등록하는 첫 과정
    Account(String accountNo, String owner, int balance) {
            this.accountNo = accountNo;
            this.owner = owner;
            this.balance = balance;

    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalanceDeposit(int money) {
        if (MIN_BALANCE <= money && money <= MAX_BALANCE) {
            this.balance += money;
            System.out.println("결과 : 입금을 완료했습니다.");
        }
        else System.out.println("0~1,000,000의 금액만 입력해주세요.");
    }

    public void setBalanceWithdraw(int money) {
        if (MIN_BALANCE <= money && money <= MAX_BALANCE) {
            this.balance -= money;
            System.out.println("결과 : 출금을 완료했습니다.");
        }
        else System.out.println("0~1,000,000의 금액만 입력해주세요.");
    }

    public int getBalance() {
        return balance;
    }

}
