package java_advanced_01.day17.AnonymousClass.class03;

class Animal {
    public String eat() {
        return "맛있게 먹습니다.";
    }
}

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal(){
            @Override
            public String eat() {
                run(); // 내부에서는 호출 가능
                return "강아지가 먹습니다.";
            }

            public String run() {
                return "강아지가 뜁니다.";
            }
        };

        System.out.println(dog.eat());
//      dog.run(); 외부에서 호출 불가능
    }
}
