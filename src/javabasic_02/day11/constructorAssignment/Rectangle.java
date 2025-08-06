package javabasic_02.day11.constructorAssignment;

public class Rectangle {
    private int width; // 가로
    private int height; // 높이
    private String color; // 색깔
    private int area; // 면적

    Rectangle() {}

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.color = "흰색";
    }

    Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getArea() {
        return area;
    }

    public void calculateArea() {
        area = width * height;
    }

}
