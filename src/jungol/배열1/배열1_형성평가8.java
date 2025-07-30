package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100]; // 전체 배열
        int[] multiples = new int[100]; // 5의 배수만 담는 배열
        int count = 0; // 5의 배수 개수
        int sum = 0; // 5의 배수 합

        // 전체 배열에 사용자 입력 값 넣기 및 5의 배수 걸러내기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) break;

            if (arr[i] % 5 == 0) {
                count++;
                multiples[i] = arr[i];
                sum += multiples[i];
            }
        }

        // 5의 배수 평균
        double avg = (double) sum / count;

        // 출력문
        System.out.printf("Multiples of 5 : %d\nsum : %d\navg : %.1f", count, sum, avg);

    }
}