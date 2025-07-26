package jungol.연산자;

public class 연산자_연습문제7 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;

        System.out.print((a != 0 && b != 0 ? 1 : 0) + " ");
        System.out.print((a != 0 || b != 0 ? 1 : 0) + " ");
        System.out.print((b != 0 && c != 0 ? 1 : 0) + " ");
        System.out.print(a == 0 ? 1 : 0);
    }
}