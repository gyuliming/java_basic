package javabasic_02.day10.morningtest;

public class SingleTone {
    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private static SingleTone instance;

    // 생성자를 private로 선언 : 외부에서 new를 사용하지 못하도록 설정
    private SingleTone() {}

    public static SingleTone getInstance() {
        if (instance != null) {
            instance = new SingleTone();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTone s1 = SingleTone.getInstance();
        SingleTone s2 = SingleTone.getInstance();
        SingleTone s3 = SingleTone.getInstance();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);
    }
}