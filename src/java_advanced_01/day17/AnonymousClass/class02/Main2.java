package java_advanced_01.day17.AnonymousClass.class02;

class Animal {
    public String eat() {
        return "맛있게 먹습니다.";
    }
}

public class Main2 {

    public static void main(String[] args) {
        // 익명 클래스 : 클래스의 정의와 객체화를 동시, 일회성 객체 사용 => 부모, 자식 간의 관계가 필요 X
        Animal dog = new Animal(){
            @Override
            public String eat() {
                return "강아지가 냠냠 먹습니다.";
            }
        };
    }
}

