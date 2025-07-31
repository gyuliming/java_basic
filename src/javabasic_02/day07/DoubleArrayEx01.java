package javabasic_02.day07;

public class DoubleArrayEx01 {

    public static void main(String[] args) {
        // 학생 3명의 국어, 영어, 수학 점수를 관리하는 2차원 배열
        int[][] scores = new int[3][3];

        // 1번 학생의 국어:90, 영어:50, 수학:80 저장하고 출력
        scores[0][0] = 90;
        scores[0][1] = 50;
        scores[0][2] = 80;

        // 2번 학생의 국어:80, 영어:100, 수학:90 저장하고 출력
        scores[1][0] = 80;
        scores[1][1] = 100;
        scores[1][2] = 90;

        // 3번 학생의 국어:100, 영어:90, 수학:90 저장하고 출력
        scores[2][0] = 100;
        scores[2][1] = 90;
        scores[2][2] = 90;

        // 각 학생들의 국어, 영어, 수학 점수와 총점과 평균을 학생별로 출력

        System.out.printf("%8s 국어 영어 수학 총점 평균\n", "");
        for (int i = 0; i < scores.length; i++) {
            int sum = 0; // 총점
            System.out.printf("학생 %d ", i + 1);

            // 점수 출력 및 총점 구하기
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%5d", scores[i][j]);
                sum += scores[i][j];
            }

            // 평균
            double avg = (double) sum / scores[i].length;

            // 학생별 총점, 평균(소수점 1자리까지) 출력
            System.out.printf("%5d %5.1f", sum, avg);
            System.out.println();
        }

    }
}
