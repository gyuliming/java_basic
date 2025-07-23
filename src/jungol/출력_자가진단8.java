package jungol;

public class 출력_자가진단8 {
    public static void main(String[] args) {
        String item1, item2, item3;
        item1 = "pen";
        item2 = "note";
        item3 = "eraser";

        int count1, count2, count3;
        count1 = 20;
        count2 = 5;
        count3 = 110;

        int price1, price2, price3;
        price1 = 100;
        price2 = 95;
        price3 = 97;

        System.out.println("      item     count     price");
        System.out.printf("%10s%10d%10d\n", item1, count1, price1);
        System.out.printf("%10s%10d%10d\n", item2, count2, price2);
        System.out.printf("%10s%10d%10d", item3, count3, price3);

    }
}
