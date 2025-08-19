package java_advanced_01.day17.AnonymousClass.class05;

public interface Operate {
    // 추상 메소드
    int operate (int a, int b);

    // default 메소드
    default void print() {
        System.out.println("print");
    }
}
