package javabasic_02.test.loop_array;

import java.util.Scanner;

public class JavaBasic9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean step = true;
        int[] scores = null;

        while (step) {
            menu();
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    scores = studentNum(sc);
                    break;

                case "2":
                    if (scores == null) {
                        System.out.println("학생 수를 입력하세요.");
                    } else {
                        scores = inputScore(sc, scores);
                    }
                    break;

                case "3":
                    scoreList(scores);
                    break;

                case "4":
                    showAvgAndMax(scores);
                    break;

                case "5":
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
        int num = Integer.parseInt(sc.nextLine());
        return new int[num];
    }

    public static int[] inputScore(Scanner sc, int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d]> ", i);
            scores[i] = Integer.parseInt(sc.nextLine());
        }
        return scores;
    }

    public static void scoreList(int[] scores) {
        if (scores == null) {
            System.out.println("점수가 입력되지 않았습니다.");
            return;
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d]: %d\n", i, scores[i]);
        }
    }

    public static void showAvgAndMax(int[] scores) {
        if (scores == null || scores.length == 0) {
            System.out.println("점수가 없습니다.");
            return;
        }

        int max = scores[0];
        int sum = 0;

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        double avg = (double) sum / scores.length;
        System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", max, avg);
    }

    public static void exit() {
        System.out.println("프로그램 종료");
    }
}
