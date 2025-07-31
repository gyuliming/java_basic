package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[4][4];

        for (int i = 0; i < scores.length - 1; i++) {
            System.out.printf("%d번째 학생의 점수 ", i + 1);
            for (int j = 0; j < scores[i].length - 1; j++) {
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 3; j < scores[i].length; j++) {
                scores[i][j] = scores[i][0] + scores[i][1] + scores[i][2];
            }
        }

        for (int i = 3; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = scores[0][j] + scores[1][j] + scores[2][j];
            }
        }

        System.out.printf("%5s국어 영어 수학 총점\n", "");
        for (int i = 0; i < scores.length; i++) {
            if (i == 3) System.out.print("합계 ");
            else System.out.printf(" %d번 ", i + 1);

            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%3d ", scores[i][j]);
            }
            System.out.println();
        }

    }
}