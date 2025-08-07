package javabasic_02.day11_12.polymorphism_assignment1;

public class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculationArea() {
        this.setArea(Math.PI * this.radius * this.radius);
    }

    @Override
    public void print() {
        System.out.printf("%s의 면적은 %.13f\n", this.getName(), this.getArea());
    }
}
