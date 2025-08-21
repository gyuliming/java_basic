package java_advanced_01.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {

    public static void main(String[] args) {
        // List<Product> products 생성
        List<Product> products = new ArrayList<>();

        // 5개 제품 생성
        products.add(new Product("p1", "피아노", "c1", 100000));
        products.add(new Product("p2", "기타", "c2", 200000));
        products.add(new Product("p3", "리코더", "c3", 10000));
        products.add(new Product("p4", "장구", "c4", 200000));
        products.add(new Product("p5", "북", "c5", 30000));

        // 객체 스트림을 얻어서 각 제품의 정보 출력
        Stream<Product> stream = products.stream();
        stream.forEach(System.out::println);
    }
}
