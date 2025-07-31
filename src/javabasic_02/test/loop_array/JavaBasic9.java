package javabasic_02.test.loop_array;

import java.util.Scanner;

public class JavaBasic9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean step = true;
        int[] scores = null;

        while (step) {
            menu();
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    scores = studentNum(sc);
                    break;

                case 2:
                    if (scores == null) {
                        System.out.println("학생 수를 입력하세요.");
                    } else {
                        scores = inputScore(sc, scores);
                    }
                    break;

                case 3:
                    scoreList(scores);
                    break;

                case 4:
                    showAvgAndMax(scores);
                    break;

                case 5:
                    exit();
                    step = false;
                    break;

                default:
                    System.out.println("1~5 숫자만 입력해주세요.");
                    System.out.println();
            }
        }


    }

    public static void menu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
        System.out.println("-----------------------------------------------------------");
        System.out.print("선택> ");
    }

    public static int[] studentNum(Scanner sc) {
        System.out.print("학생수> ");
        int num = sc.nextInt();
        return new int[num];
    }

    public static int[] inputScore(Scanner sc, int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d]> ", i);
            scores[i] = sc.nextInt();
        }
        return scores;
    }

    public static void scoreList(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d]: %d\n", i, scores[i]);
        }
    }

    public static void showAvgAndMax (int[] scores) {
        int max = scores[0];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            if (max <= scores[i]) {
                max = scores[i];
            }
            sum += scores[i];
        }
        double avg = (double) sum / scores.length;

        System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", max, avg);
    }

    public static void exit() {
        System.out.println("프로그램 종료");
    }

}


