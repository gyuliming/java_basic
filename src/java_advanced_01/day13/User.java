package java_advanced_01.day13;

public class User {

    public static void main(String[] args) {
        // 구현 객체 생성
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 부모 클래스가 인터페이스를 구현하고 있다면, 자식 클래스도 인터페이스 타입으로 자동 타입 변환 가능
        A a;
        a = b;
        a = c;
        a = d;
        a = e;
    }
}
