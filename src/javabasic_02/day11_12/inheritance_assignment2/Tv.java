package javabasic_02.day11_12.inheritance_assignment2;

public class Tv {
    String color;
    boolean power;
    int channel;

    Tv() {
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void power() {
        this.power = !power;
    }

    public void channelUp() {
        this.channel += 1;
    }

    public void channelDown() {
        this.channel -= 1;
    }

    public void print() {
        System.out.printf("color :%-8s power :%-8b channel :%-8d\n", this.color, this.power, this.channel);
    }

}
