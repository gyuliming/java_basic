package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height1, weight1, height2, weight2;

        height1 = sc.nextInt();
        weight1 = sc.nextInt();
        height2 = sc.nextInt();
        weight2 = sc.nextInt();

        System.out.println((height1 > height2 && weight1 > weight2) ? 1 : 0);

    }
}