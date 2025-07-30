package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100]; // 크기 100 배열 생성
        int count = 0; // 저장 개수

        // arr 배열에 값 받기, 0이 입력되면 끝
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            count++;

            if (arr[i] == 0) break;

            // 짝수면 나누기2, 홀수면 곱하기2
            if (arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else {
                arr[i] *= 2;
            }
        }
        count--; // 마지막으로 받은 수 0은 포함되지 않으므로 -1 해주기

        // 출력
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}