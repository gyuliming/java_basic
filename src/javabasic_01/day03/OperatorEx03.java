package javabasic_01.day03;

public class OperatorEx03 {

    public static void main(String[] args) {
        // 논리연산자는 논리곱(&&), 논리합(||), 배타적 논리합(^), 논리 부정(!)
        // AND(논리곱) : 피연산자 모두가 true일 경우에만 연산 결과가 true
        // OR(논리합) : 피연산자 중 하나만 true이면 연산 결과는 true
        // XOR(배타적 논리합) : 피연산자 하나는 true이고 다른 하나가 false일 경우에만 연산 결과가 true
        // NOT(논리 부정) : 피연산자의 논리값을 바꿈

        int charCode = 'A';
        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("알파벳 대문자 입니다.");
        }

        charCode = 'a';
        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("알파벳 소문자 입니다.");
        }

        charCode = '5';
        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0-9 사이의 숫자입니다.");
        }

        // 현재 value의 값이 2의 배수 or 3의 배수인지를 검사하는 수식
        int value = 6;
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수입니다.");
        }

        value = 7;
        boolean result = (value % 2 == 0) || (value % 3 == 0);
        if (!result) {
            System.out.println("2 또는 3의 배수가 아닙니다.");
        }

    }
}
