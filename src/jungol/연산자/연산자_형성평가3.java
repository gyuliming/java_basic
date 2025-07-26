package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width, length, area;

        width = sc.nextInt() + 5;
        length = sc.nextInt() * 2;
        area = width * length;

        System.out.printf("width = %d\nlength = %d\narea = %d", width, length, area);
    }
}