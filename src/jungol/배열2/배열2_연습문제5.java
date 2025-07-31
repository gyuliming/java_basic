package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3]; // 첫 번째 배열
        int[][] arr2 = new int[3][3]; // 두 번째 배열
        int[][] sum = new int[3][3]; // 첫 번째 배열 + 두 번째 배열

        // 첫 번째 배열 값 넣기
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("첫 번째 배열 %d행 ", i + 1);
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // 두 번째 배열 값 넣기
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("두 번째 배열 %d행 ", i + 1);
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // 두 배열의 합 구하기
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}