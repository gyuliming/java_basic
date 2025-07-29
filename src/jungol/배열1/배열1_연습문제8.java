package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = (double) sum / arr.length;

        System.out.printf("총점 = %d\n평균 = %.1f", sum, avg);

    }
}
