package javabasic_02.day11.inheritance.sec01;

public class AA {
    private int aa = 10; // private를 사용하면 상속 불가능
    private int bb = 20;

    public void printAA() {
        System.out.print(aa);
    }

    public int getBb() {
        return bb;
    }

    public int getAa() {
        return aa;
    }
}
