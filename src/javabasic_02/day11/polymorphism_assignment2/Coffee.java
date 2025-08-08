package javabasic_02.day11.polymorphism_assignment2;

public class Coffee extends Beverage {
    static int amount;

    Coffee(String name) {
        super(name);
        amount++;
    }


    @Override
    public void calcPrice() {
        switch (getName()) {
            case "Americano":
                setPrice(1500);
                break;
            case "CafeLatte":
                setPrice(2500);
                break;
            case "Cappuccino":
                setPrice(3000);
                break;
        }
    }

    @Override
    public void print() {
        super.print();
    }
}
