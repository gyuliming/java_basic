package javabasic_02.day12.interface_assignment1;

public class Dog extends Animal {
    Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance = speed * (hours / 2.0);
    }


}
