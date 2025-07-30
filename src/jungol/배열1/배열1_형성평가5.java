package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weights = new double[6];
        double sum = 0;

        for (int i = 0; i < weights.length; i++) {
            weights[i] = sc.nextDouble();
            sum += weights[i];
        }

        double avg = sum / weights.length;
        System.out.printf("%.1f", avg);

    }
}