package javabasic_02.day12;

public interface Service {
    // 디폴트 메소드
    default void defaultMethod1() {
        System.out.println("defaultMethod1()");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2()");
        defaultCommon();
    }

    // private 메소드
    private void defaultCommon() {
        System.out.println("defaultMethod의 중복코드 A");
        System.out.println("defaultMethod의 중복코드 B");
    }

    // static 메소드
    static void staticMethod1() {
        System.out.println("staticMethod1()");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2()");
        staticCommon();
    }

    // private static 메소드
    private static void staticCommon() {
        System.out.println("staticMethod 중복코드 A");
        System.out.println("staticMethod 중복코드 B");
    }

}
