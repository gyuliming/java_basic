package javabasic_02.day11.polymorphism_assignment3;

public class Truck extends Wheeler{

    Truck(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        this.velocity += speed * 5;
        if (this.velocity > 100) {
            velocity = 100;
            System.out.printf("%s의 최고속도위반으로 속도를 %d으로 내립니다.\n", this.carName, velocity);
        } else {
            System.out.printf("%s의 현재 속도는 %d 입니다.\n", this.carName, this.velocity);
        }
    }

    @Override
    public void speedDown(int speed) {
        this.velocity -= speed * 5;
        if (this.velocity < 50) {
            velocity = 50;
            System.out.printf("%s의 최저속도위반으로 속도를 %d으로 올립니다.\n", this.carName, velocity);
        } else {
            System.out.printf("%s의 현재 속도는 %d 입니다.\n", this.carName, this.velocity);
        }
    }

}
