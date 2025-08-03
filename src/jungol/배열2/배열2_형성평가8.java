package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2]; // 4행 2열

        int allSum = 0; // 전체 합
        int rowSum; // 가로 합
        int colSum; // 세로 합

        // 배열 입력 받기 + 전체 합
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                allSum += arr[i][j];
            }
            System.out.println();
        }

        // 가로 합
        for (int i = 0; i < 4; i++) {
            rowSum = 0;
            for (int j = 0; j < 2; j++) {
                rowSum += arr[i][j];
            }
            // 가로 평균
            System.out.print(rowSum / 2 + " ");
        }
        System.out.println();

        // 세로 합
        for (int j = 0; j < 2; j++) {
            colSum = 0;
            for (int i = 0; i < 4; i++) {
                colSum += arr[i][j];
            }
            // 세로 평균
            System.out.print(colSum / 4 + " ");
        }
        System.out.println();

        System.out.println(allSum / 8);
    }
}