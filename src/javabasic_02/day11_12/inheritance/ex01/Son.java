package javabasic_02.day11_12.inheritance.ex01;

public class Son extends Father {
    public String name = "홍길동";

    public void printDetails() {
        System.out.println("나의 이름은 " + name);
        this.getFamilyName();
        this.getHouseAddress();
    }

    public static void main(String[] args) {
        Son objSon = new Son();
        objSon.printDetails();
    }
}
