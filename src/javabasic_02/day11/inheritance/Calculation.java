package javabasic_02.day11.inheritance;

public class Calculation extends Object {

    public void addition(int num1, int num2) {
        System.out.println("두 수의 덧셈 : " + (num1 + num2));
    }

    public void subtraction(int num1, int num2) {
        System.out.println("두 수의 뺄셈 : " + (num1 - num2));
    }

}
