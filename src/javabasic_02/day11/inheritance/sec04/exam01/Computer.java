package javabasic_02.day11.inheritance.sec04.exam01;

public class Computer extends Calculator {

    Computer() {
        super();
    }

	//메소드 오버라이딩
    @Override // 어느테이션 : 컴파일 시 정확히 오버라이딩이 되었는지 체크(생략 가능)
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
//        super.areaCircle(r);
        double rr = super.areaCircle(r); // 공동 처리 기법
        return Math.PI * rr * rr;
    }
}