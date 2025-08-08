package javabasic_02.day11.polymorphism_assignment2;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void calcPrice();

    public void print() {
        System.out.println(name + "이며, 가격은 " + price);
    }
}
