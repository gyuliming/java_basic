package javabasic_02.day11.inheritance.sec01;

public class Inheritance01 extends Calculation {

    public void multiplication(int num1, int num2) {
        System.out.println("두 수의 곱셈 : " + (num1 * num2));
    }

//    public static void main(String[] args) {
//        Inheritance01 obj = new Inheritance01();
//
//        obj.addition(5, 2);
//        obj.subtraction(5, 2);
//        obj.multiplication(5, 2);
//    }
}
