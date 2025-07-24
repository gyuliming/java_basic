package jungol.입력;

public class 입력_연습문제5 {
    public static void main(String[] args) {
        double x = 1.2340;
        double y = 10.3459;

        System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력");
        System.out.printf("x = %7.4f\ny = %7.4f\n", x, y);

        System.out.println("소수 2자리까지 출력(반올림)");
        System.out.printf("x = %.2f\ny = %.2f", x, y);

    }
}
