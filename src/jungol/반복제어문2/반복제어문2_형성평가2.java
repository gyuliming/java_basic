package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }
}
