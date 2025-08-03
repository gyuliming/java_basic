package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] diceNum = new int[6];
        int input;

        for (int i = 0; i < 10; i++) {
            input = sc.nextInt();
            diceNum[input - 1]++;
        }

        for (int i = 0; i < diceNum.length; i++) {
            System.out.printf("%d : %d\n", i + 1, diceNum[i]);
        }

    }
}