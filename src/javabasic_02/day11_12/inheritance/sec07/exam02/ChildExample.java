package javabasic_02.day11_12.inheritance.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
		child.method1();

		//자동 타입 변환
		// Parent 클래스로 child를 제한
		Parent parent = child;

		//메소드 호출
		parent.method1();
		System.out.println(parent.name);
//		System.out.println(parent.childName);
		parent.method2();
//		parent.method3(); child의 메소드이므로 호출 불가능

		Child child1 = (Child) parent;
		child1.method3();
		System.out.println(child1.childName);
	}
}