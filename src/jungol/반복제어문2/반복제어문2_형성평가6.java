package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        int count = 0;
        double avg;

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }
        avg = (double) sum / count;

        System.out.printf("sum : %d\navg : %.1f", sum, avg);
    }
}
