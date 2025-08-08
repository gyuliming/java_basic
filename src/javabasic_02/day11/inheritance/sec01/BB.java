package javabasic_02.day11.inheritance.sec01;

public class BB extends AA {
    private int cc = 30;

    // super : 부모 객체의 주소값이 담겨있음
    void adder() {
        int result = this.getAa() + this.getBb() + cc;
        System.out.println(result);
    }

    public int getCc() {
        return cc;
    }

}
