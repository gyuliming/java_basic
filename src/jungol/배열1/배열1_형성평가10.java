package jungol.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_형성평가10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // 사용자 입력
        int[] arr = new int[input]; // 사용자가 입력한 크기의 배열 생성

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        // 내림차순 정렬을 위해 swap
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // 출력
        for (int i : arr) {
            System.out.println(i);
        }

    }
}