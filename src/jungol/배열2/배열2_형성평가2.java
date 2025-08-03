package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[11];
        int score;

        for (int i = 1; i <= 100; i++) {
            score = sc.nextInt();

            if (1 < score && score <= 100) {
                students[score / 10]++;
            }

            if (score == 0) {
                break;
            }

        }

        for (int i = students.length - 1; i >= 0; i--) {
            switch (students[i]) {
                case 0: break;
                default: System.out.printf("%d : %d person\n", i * 10, students[i]); break;
            }
        }

    }
}