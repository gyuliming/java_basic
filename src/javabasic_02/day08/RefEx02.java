package javabasic_02.day08;

// 똑같은 변수 a의 주소값을 출력했음에도 문자열이 변경됨에 따라 출력되는 해시코드의 값이 다름

public class RefEx02 {

    public static void main(String[] args) {
        // 모든 입력은 String 타입으로 처리함, String은 불변
        String a = "Hello";
        System.out.println(a.hashCode());

        a += "Java Programming";
        System.out.println(a.hashCode());
        System.out.println(a);
    }
}
