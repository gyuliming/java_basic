package javabasic_02.day11_12.inheritance.test0806.test03;

public class Account {
    private String accNo;
    private int balance;

    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(this.accNo + " 계좌가 개설되었습니다.");
    }

    public int getBalance() {
        return balance;
    }

    // 입금
    public void save(int money) {
        this.balance += money;
        System.out.println(getAccNo() + " 계좌에 " + money + "만원이 입금되었습니다.");
    }

    // 출금
    public void withdraw(int money) {
        this.balance -= money;
        System.out.println(getAccNo() + " 계좌에 " + money + "만원이 출금되었습니다.");

    }

    // 계좌번호 확인
    public String getAccNo() {
        return accNo;
    }
}
