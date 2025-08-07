package javabasic_02.day11_12.constructor_assignment;

public class Rectangle2 {
    private int width;
    private int length;
    private String color;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    // 면적
    public int area() {
        return width * length;
    }

    // 둘레
    public int perimeter() {
        return (width * 2) + (length * 2);
    }
}
