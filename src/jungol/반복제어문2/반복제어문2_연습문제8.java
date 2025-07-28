package jungol.반복제어문2;

public class 반복제어문2_연습문제8 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 5; j++) {
                int result = j * i;
                System.out.printf("%d * %d = %2d   ", j, i, result);
            }
            System.out.println();
        }
    }
}
