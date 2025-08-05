package javabasic_02.day10.morningtest;

public class Account_1 {
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;
    private int balance;

    public void setBalance(int money) {
        if (MIN_BALANCE <= money && money <= MAX_BALANCE) this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account_1 account = new Account_1();
        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

        account.setBalance (300000);
        System.out.println("현재 잔고: "+ account.getBalance()); //현재 잔고: 300000
    }
}
