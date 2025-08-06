package javabasic_02.day11.inheritanceAssignment;

public class Alcohol extends Drink {
    double alcper;

    Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.printf("%-16s%-8s%-8s%-8s\n", "상품명(도수[%])", "단가", "수량", "금액");
    }

    @Override
    public void printData() {
        System.out.printf("%-16s%-8d%-8d%-8d\n", name + "(" + alcper + ")", price, count, price * count);
    }
}
