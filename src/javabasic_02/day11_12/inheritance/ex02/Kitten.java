package javabasic_02.day11_12.inheritance.ex02;

public class Kitten extends Cat{
    public void meow2 () {
        System.out.println("새끼 고양이가 야옹하고 울다.");
    }

    public static void main(String[] args) {
        Kitten objKitten = new Kitten();
        objKitten.meow2();
        objKitten.meow();
        objKitten.eat();
    }
}
