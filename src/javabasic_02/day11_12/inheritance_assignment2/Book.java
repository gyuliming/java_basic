package javabasic_02.day11_12.inheritance_assignment2;

public class Book {
    private String title;
    private int price;

    public Book () {}

    public Book (String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
