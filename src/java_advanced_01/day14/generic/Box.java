package java_advanced_01.day14.generic;

public class Box {
    // Box에 넣을 내용물을 content 필드 선언
    // Object 타입은 모든 클래스의 최상위 부모 클래스이므로 프로모션(자동변환)이 된다.
    // 모든 객체는 부모 타입인 Object로 자동 타입 변환이 된다.
    // content는 어떤 객체든 대입이 가능하다.

    public Object content;

    public static void main(String[] args) {
        Box box = new Box();
        box.content = "바비인형";
//        box.content = 10;
//        box.content = 100.0;

        // 문제는 Box안의 내용물을 얻을 때이다.
        // Content는 Object 타입이므로 어떤 객체가 대입되어 있는지 확실하게 알 수가 없다.
        String doll = (String) box.content;

        // 어떤 내용물이 저장되어있는지 모른다면 instanceof를 이용하여 타입조사를 할 수 있지만 타입을 모두 다 조사할 수는 없다. (= if 지옥)

    }

}
