package javabasic_02.day11.polymorphism_assignment2;

public class Tea extends Beverage {
    int amount;

    Tea (String name, int amount) {
        super(name);
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "lemonTea" -> setPrice(1500);
            case "ginsengTea" -> setPrice(2000);
            case "redginsengTea" -> setPrice(2500);
        }
    }

    @Override
    public void print() {
        super.print();
    }
}
