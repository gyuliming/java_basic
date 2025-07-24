package day02;

public class VariableEx01 {
    public static void main(String[] args) {
        // 1. 정수형 변수 value를 선언
        int value;

        // 2. 변수 value에 20 할당
        value = 20;

        // 3. 변수 result에 value 변수에 30을 더한 후 저장
        int result;
        result = value + 30;

        // 4. 변수 result의 값을 콘솔에 출력
        System.out.println(result);

        int x = 0xB3;
        int y = 0x2A0F;

        System.out.printf("%d %d\n", x, y);

        byte var1 = -128;
        byte var2 = (byte) 128;
        System.out.println(var2);
    }
}
