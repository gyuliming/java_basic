package javabasic_02.day12.interface_assignment1;

public class Chicken extends Animal implements Cheatable {
    Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance = speed * hours;
    }

    @Override
    public void fly() {
        distance += speed * 2;
    }



}

