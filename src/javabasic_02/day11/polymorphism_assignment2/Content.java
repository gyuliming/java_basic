package javabasic_02.day11.polymorphism_assignment2;

public abstract class Content {
    String title;
    int price;

    Content() {}

    Content(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public abstract void totalPrice();

    public void show() {
        System.out.printf("%s 비디오의 가격은 %d원 입니다.\n", this.title, this.price);
    }
}

