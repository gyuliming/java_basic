package day03;

public class PrintEx {

    public static void main(String[] args) {
        // 표준 출력 장치인 모니터에 값을 출력하였다.
        // System. + out. + println(리터럴 또는 변수);
        // 시스템으로 출력하는데 괄호안의 내용을 출력하고 행을 바꿔라
        // 출력방법에 따라 println(), print(), printf()

        System.out.printf("과목명: %s \n", "자바");
        System.out.printf("과목명: %1$s, 이름: %2$s\n", "자바", "GYULIM"); // 순번매기기
        System.out.printf("과목명: %1$s, 이름: %2$s, 학번: %3$s\n", "자바", "GYULIM", "1234"); // 순번매기기(인자 지정)

        // 정수 123을 printf() 출력
        System.out.printf("%d\n", 123);

        // ___123
        System.out.printf("%6d\n", 123);

        // 123___
        System.out.printf("%-6d\n", 123);

        // 000123
        System.out.printf("%06d\n", 123);

        System.out.println("========실수 표현========");

        // 정수 7자리 + 소수점 + 소수 2자리, 왼쪽 빈자리 공백  ____123.45
        System.out.printf("%10.2f\n", 123.45);
        System.out.printf("%10.2f\n", 123.456); // 반올림

        // 정수 7자리 + 소수점 + 소수 2자리, 왼쪽 빈자리 공백  0000123.45
        System.out.printf("%010.2f\n", 123.45);

        System.out.println("========문자열 표현========");

        // 문자열은 %s 포맷 사용 : abc 출력
        System.out.printf("%s\n", "abc");

        // 문자열은 %s 포맷 사용 : ___abc 출력
        System.out.printf("%6s\n", "abc");

        // 특수문자 \t, \n, %%
        System.out.printf("소금물의 농도: %d %%\n", 35);
    }
}
