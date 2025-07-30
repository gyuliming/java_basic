package javabasic_01.day02;

public class tempEx02 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int temp = 0;

        System.out.printf("스왑 전 : x = %d, y = %d, temp = %d\n", x, y, temp);

        temp = x;
        x = y;
        y = temp;

        System.out.printf("스왑 후 : x = %d, y = %d, temp = %d", x, y, temp);

    }
}
