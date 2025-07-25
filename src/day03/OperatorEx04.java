package day03;

public class OperatorEx04 {

    public static void main(String[] args) {

        // & bit 단위로 논리연산을 수행, 대상은 bit 0, 1
        // 피연산자가 2진수 0과 1로 저장되는 정수타입(byte, short, int, long)만 대상이 됨.
        // 실수타입(float, double)은 bit 연산의 대상이 될 수 없다.

        // AND(논리곱 : &) : 두 비트 모두 1일 경우에만 연산 결과 1
        // OR(논리합 : |) : 두 비트 중 하나만 1이면 연산 결과 1
        // XOR(배타적 논리합 : ^) : 두 비트 중 하나는 1이고 다른 하나가 0일 경우 연산 결과 1
        // NOT(논리 부정 : ~) : 보수

        // 45 => 00101101
        // 25 => 00011001
        // 45 & 25 => 00001001 => 9
        // 45 | 25 => 00111101 => 61
        // 45 ^ 25 => 00110100 => 52
        // ~45 => 11010010 => -46

        // a << b : a x 2^b
        // a >> b : a / 2^b

        int num1 = 1;
        int result1 = num1 << 3; // 1 x 2^3
        // Math.pow(2, 3) => 2^3
        int result2 = num1 * (int) Math.pow(2, 3); // 1 x 2^3
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);

        // 대입 연산자, 복합대입연산자 +=, -=, *=, /=, %=
        int r = 0;
        r += 10; // r = r + 10;
        System.out.printf("현재 r = %d\n", r);
        r -= 5; // r = r - 5;
        System.out.printf("현재 r = %d\n", r);
        r *= 2; // r = r * 2;
        System.out.printf("현재 r = %d\n", r);
        r /= 5; // r = r / 5;
        System.out.printf("현재 r = %d\n", r);
        r %= 2; // r = r % 2;
        System.out.printf("현재 r = %d\n", r);

    }

}
