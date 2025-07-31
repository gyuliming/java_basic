package javabasic_02.test.loop_array;

import java.util.Scanner;

public class JavaBasic9 {

    // 메뉴 메소드
    public static void menu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
        System.out.println("-----------------------------------------------------------");
        System.out.print("선택> ");
    }

    // 학생수 입력 메소드
    public static int[] studentNum(Scanner sc) {
        System.out.print("학생수> ");
        int num = sc.nextInt();
        sc.nextLine();
        return new int[num];
    }

    // 점수 입력 메소드
    public static int[] inputScore(Scanner sc, int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d]> ", i);
            scores[i] = sc.nextInt();
            sc.nextLine();
        }
        return scores;
    }

    // 점수리스트 확인 메소드(점수 입력X -> 되돌아감)
    public static void scoreList(int[] scores) {
        if (scores == null) {
            System.out.println("점수가 입력되지 않았습니다.");
            return;
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d]: %d\n", i, scores[i]);
        }
    }

    // 최고점수, 평균 표시 메소드(점수 입력X -> 되돌아감)
    public static void showMaxAndAvg(int[] scores) {
        if (scores == null || scores.length == 0) {
            System.out.println("점수가 입력되지 않았습니다.");
            return;
        }

        int max = 0;
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            max = Math.max(max, scores[i]);
            sum += scores[i];
        }

        double avg = (double) sum / scores.length;
        System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", max, avg);
    }

    // 종료 메소드
    public static void exit() {
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean step = true; // while 문 조건
        int[] scores = null; // null로 받아서 배열 할당X

        while (step) {
            menu(); // 메뉴 메소드 호출
            String input = sc.nextLine();

            switch (input) {
                // 1번 선택 -> 학생 수 입력
                case "1":
                    scores = studentNum(sc);
                    break;

                // 2번 선택 -> 점수 입력(scores 배열이 비어있으면 if문 수행)
                case "2":
                    if (scores == null) {
                        System.out.println("학생 수를 입력하세요.");
                    } else {
                        scores = inputScore(sc, scores);
                    }
                    break;

                // 3번 선택 -> 점수 리스트 메소드 호출
                case "3":
                    scoreList(scores);
                    break;

                // 4번 선택 -> 점수 분석(최고 점수, 평균)
                case "4":
                    showMaxAndAvg(scores);
                    break;

                // 종료
                case "5":
                    exit();
                    step = false;
                    break;

                default:
                    System.out.println("1~5 숫자만 입력해주세요.");
            }
        }
    }
}