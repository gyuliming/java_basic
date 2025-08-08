package javabasic_02.day11.polymorphism_assignment3;

public class Bike extends Wheeler {

    Bike(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        this.velocity += speed;
        if (this.velocity > 40) {
            velocity = 40;
            System.out.printf("%s의 최고속도위반으로 속도를 %d으로 내립니다.\n", this.carName, velocity);
        } else {
            System.out.printf("%s의 현재 속도는 %d 입니다.\n", this.carName, this.velocity);
        }
    }

    @Override
    public void speedDown(int speed) {
        this.velocity -= speed;
        if (this.velocity < 10) {
            velocity = 10;
            System.out.printf("%s의 최저속도위반으로 속도를 %d으로 올립니다.\n", this.carName, velocity);
        } else {
            System.out.printf("%s의 현재 속도는 %d 입니다.\n", this.carName, this.velocity);
        }
    }

}
