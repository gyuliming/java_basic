package javabasic_02.day11_12.polymorphism_assignment2;

public class Coffee extends Beverage {
    int amount;

    Coffee(String name, int amount) {
        super(name);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "Americano" -> setPrice(1500);
            case "CafeLatte" -> setPrice(2500);
            case "Cappuccino" -> setPrice(3000);
        }
    }

    @Override
    public void print() {
        super.print();
    }
}
