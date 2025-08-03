package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가7 {

    public static void main(String[] args) {
        // 2x3 배열 2개 생성
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];

        Scanner sc = new Scanner(System.in);

        // 첫 번째 배열
        System.out.println("first array");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // 두 번째 배열
        System.out.println("second array");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // 두 배열 곱하기
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] * arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}