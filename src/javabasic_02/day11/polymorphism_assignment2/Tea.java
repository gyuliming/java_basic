package javabasic_02.day11.polymorphism_assignment2;

public class Tea extends Beverage {
    static int amount;

    Tea (String name) {
        super(name);
        amount++;
    }


    @Override
    public void calcPrice() {
        switch (getName()) {
            case "lemonTea":
                setPrice(1500);
                break;
            case "ginsengTea":
                setPrice(2000);
                break;
            case "redginsengTea":
                setPrice(2500);
                break;
        }
    }

    @Override
    public void print() {
        super.print();
    }
}
