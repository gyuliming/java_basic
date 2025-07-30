package jungol.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_행복 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        // 오름차순 정렬
        Arrays.sort(scores);

        int min = scores[0];
        int max = scores[scores.length - 1];
        System.out.println(max - min);

    }
}
