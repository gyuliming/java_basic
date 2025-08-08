package javabasic_02.day11.polymorphism_assignment1;

public abstract class Shape {
    protected double area;
    private String name;

    public Shape() {}

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculationArea();

    public void print() {

    }
}
