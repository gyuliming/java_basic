package javabasic_02.day11.inheritance.sec01;

public class Cat extends Animal {
    public void meow() {
        System.out.println("야옹");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();

        obj.eat();
        obj.meow();
    }
}
