package jungol.배열1;

import java.util.Arrays;

public class 배열1_연습문제9 {

    public static void main(String[] args) {
        int[] arr = new int[]{50, 75, 85, 95, 100};
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
