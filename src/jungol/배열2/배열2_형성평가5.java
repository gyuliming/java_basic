package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] school = new int[4][3];
        int[] sum = new int[4];

        for (int i = 0; i < school.length; i++) {
            System.out.printf("%dclass? ", i + 1);

            for (int j = 0; j < school[i].length; j++) {
                school[i][j] = sc.nextInt();
                sum[i] += school[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.printf("%dclass : %d\n", i + 1, sum[i]);
        }

    }
}