package javabasic_02.day11.inheritance.sec08.shape;

public class M01 {

    // 사각형, 삼각형, 원 클래스는 서로 다른 타입이어서 각각 타입을 정의해서 같은 타입끼리 묶어서 관리
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle();
        rectangles[3] = new Rectangle();

        Triangle[] triangles = new Triangle[5];
        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle();
        }

        Circle[] circles = new Circle[3];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }

        Shape[] shapes = new Shape[4];
        shapes[0] = rectangles[0];
        shapes[1] = rectangles[1];
        shapes[2] = triangles[2];
        shapes[3] = circles[2];

        Circle circle = (Circle) shapes[3]; // 다운캐스팅
    }
}
// 하나의 자료형 shape 타입으로 관리하니까 코드량도 적어지고 가독성도 좋아지고 유지보수성도 좋아진다.
// 자식클래스에서만 있는 고유 메서드를 실행하려면 업캐스팅한 객체를 다시 자식클래스로 다운캐스팅 해줘야 한다.