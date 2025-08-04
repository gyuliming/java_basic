package javabasic_02.day09.methodBasic;

public class Example02 {
    public static String greeting() {
        String greeting = "Hello";
        return greeting;
    }

    public static void main(String[] args) {
        String str = greeting();
        System.out.println(str + "JAVA");

        System.out.println(greeting());
    }
}
