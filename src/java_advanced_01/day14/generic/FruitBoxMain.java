package java_advanced_01.day14.generic;

public class FruitBoxMain {

    public static void main(String[] args) {
        // 제네릭 타입 매개변수에 정수 타입을 할당
        // FruitBox<Integer> Box = new FruitBox<>();
        // 제네릭 타입 매개변수에 실수 타입을 할당
        // FruitBox<Double> Box = new FruitBox<>();
        // 제네릭 타입 매개변수에 문자열 타입을 할당
        // FruitBox<String> Box = new FruitBox<>();
        // 제네릭 타입 매개변수에 Apple 타입을 할당
        FruitBox<Apple> Box = new FruitBox<>();
        Apple apple = new Apple();
        Box.add(apple);
        for (int i = 0; i < 5; i++) {
            Box.add(new Apple());
        }



    }
}
