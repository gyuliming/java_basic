package javabasic_02.day11.inheritance.sec06.package2;

import javabasic_02.day11.inheritance.sec06.package1.A;

public class D extends A {
	//생성자 선언
    public D () {
        super(); // extends A의 기본 생성자를 호출
    }

	//메소드 선언
    public void method1() { // 다른 패키지에서는 상속을 통해서 사용 가능
        this.field = "value";
        this.method();
    }

	//메소드 선언
    // extends를 하더라도 다른 패키지에서는 직접 객체 생성이 불가능
    public void method2() {
//        A a = new A();
//        a.field = "method";
//        a.method();
    }

}