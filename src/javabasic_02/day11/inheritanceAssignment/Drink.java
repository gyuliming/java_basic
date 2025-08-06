package javabasic_02.day11.inheritanceAssignment;

public class Drink {
    String name;
    int price;
    int count;

    Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    // 금액(단가 + 수량)
    public int getTotalPrice() {
        return price * count;
    }

    // 타이틀 출력
    public static void printTitle() {
        System.out.printf("%-8s%-8s%-8s%-8s\n", "상품명", "단가", "수량", "금액");
    }

    // 상품 정보 출력
    public void printData() {
        System.out.printf("%-8s%-8d%-8d%-8d\n", name, price, count, price * count);
    }

}
