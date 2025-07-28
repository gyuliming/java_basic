package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_연습문제5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.printf("입력받은 짝수는 %d개입니다.", count);
    }
}
