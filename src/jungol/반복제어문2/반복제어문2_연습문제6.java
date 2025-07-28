package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_연습문제6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double avg;
        int[] arr = new int[5];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        avg = (double) total / arr.length;

        System.out.printf("총점 : %d\n평균 : %.1f", total, avg);
    }
}
