package java_advanced_01.day14.generic;

// 타입 파라미터 정의 방법

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T> {
    List<T> fruits = new ArrayList<>(); // T 클래스 필드로 지정

    public void add(T fruit) { // 메소드의 매개변수의 타입 지정
        fruits.add(fruit);
    }


}
