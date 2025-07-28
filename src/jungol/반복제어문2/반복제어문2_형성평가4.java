package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = (double) sum / arr.length;

        System.out.printf("%.2f", avg);

    }
}
