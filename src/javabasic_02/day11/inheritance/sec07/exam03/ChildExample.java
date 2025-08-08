package javabasic_02.day11.inheritance.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		//부모 타입으로 자식 객체 생성
		Parent parent = new Child();

		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
//		parent.field2 = "data2";
//		parent.method3();

		//강제 타입 변환
		Child child = (Child) parent;
		
		//Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();

	}
}