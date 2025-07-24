package day02;

public class CastingEx {
    public static void main(String[] args) {
        // long => int : 8 => 4

        long longValue = 300;
        int intValue = (int) longValue; // 강제 타입 변환 : 손실 X

        System.out.println(intValue);

        // int => char : 4 => 1
        // int 타입은 char 타입으로 자동변환 되지 않고, (char) 강제 캐스팅을 해야 함. 0~65535 사이의 값만 원래 값을 유지

        int intValue2 = 65;
        char charValue = (char) intValue2;

        System.out.println(charValue);

        // 실수 => 정수

        double doubleValue2 = 3.14;
        int intValue3 = (int) doubleValue2; // 손실 발생 O

        System.out.println(intValue3);

        byte result = 10 + 20; // 컴파일 byte result = 30 => 바이트 코드로 생성

        int result1 = intValue2 + intValue3;
        double result2 = 1.2f + 2.4f; // 컴파일 byte result2 = 3.6f가 되면 자동변환으로 double 타입으로 변환됨

        double result3 = 1.2f + 3.4; // 1.2f가 double형으로 변환됨

        // 예외사항 정리 : 자바에서 + 연산자가 두 가지 기능을 가지고 있다. 덧셈 연산, 연결 연산
        int v1 = 3 + 7; // 10;
        System.out.println(v1);

        // 피연산자 중 하나가 문자열일 경우 나머지 피연산자도 문자열로 자동변환되어 문자열 결합연산 수행
        String str1 = "3" + 7; // "3" + "7" -> "37"
        System.out.println(str1);

        int v2 = 1 + 2 + 3; // 3 + 3 => 6   int v2 = 6;
        String str = ""; // 문자열 초기화 방법 (공백 없어도 됨)

        str = 1 + 2 + "3"; // 3 + "3" => "33"
        System.out.println(str);

        str = 1 + "2" + 3; // "12" + 3 => "123"
        System.out.println(str);

        str = "1" + 2 + 3; // "12" + 3 => "123"
        System.out.println(str);

        str = "1" + (2+3); // "1" + 5 => "15"
        System.out.println(str);


    }
}
