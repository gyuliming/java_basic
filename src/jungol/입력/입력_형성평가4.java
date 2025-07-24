package jungol.입력;

import java.util.Scanner;

public class 입력_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, sum;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum = a + b + c;

        System.out.printf("sum = %d", sum);
    }
}
