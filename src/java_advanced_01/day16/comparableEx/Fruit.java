package java_advanced_01.day16.comparableEx;

// 과일을 가격 기준으로 오름차순 정렬할 수 있도록 비교기를 구현
import java.util.TreeSet;

public class Fruit implements Comparable<Fruit> {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 비교기를 직접 구현 해줘야 함
    @Override
    public int compareTo(Fruit o) {
        if (this.price < o.price) return -1;
        else if (this.price > o.price) return 1;
        else return 0;
    }

    // 사과 10000원, 귤 12000원, 복숭아 8000원, 포도 18000원, 총각네과일가게 TreeSet 에 넣어 가격 관리
    // 총각네과일가게 상품 리스트를 오름차순으로 출력
    public static void main(String[] args) {
        TreeSet<Fruit> 총각네과일가게 = new TreeSet<>();
        Fruit f1 = new Fruit("사과", 10000);
        Fruit f2 = new Fruit("귤", 12000);
        Fruit f3 = new Fruit("복숭아", 8000);
        Fruit f4 = new Fruit("포도", 18000);

        총각네과일가게.add(f1);
        총각네과일가게.add(f2);
        총각네과일가게.add(f3);
        총각네과일가게.add(f4);

        for (Fruit fruit : 총각네과일가게) {
            System.out.println(fruit.name + " " + fruit.price);
        }
    }

}
