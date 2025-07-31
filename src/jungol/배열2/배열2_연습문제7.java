package jungol.배열2;

public class 배열2_연습문제7 {

    public static void main(String[] args) {
        int[][] pascal = new int[5][5];

        // 맨 앞 1 초기화
        for (int i = 0; i < pascal.length; i++) {
            pascal[i][0] = 1;
        }

        // 파스칼 삼각형
        for (int i = 1; i < pascal.length; i++) {
            for (int j = 1; j < pascal[i].length; j++) {
                pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
            }
        }

        // 출력(0 부분 제외)
        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                switch (pascal[i][j]) {
                    case 0:
                        System.out.print(" ");
                        break;
                    default:
                        System.out.print(pascal[i][j] + " ");
                        break;
                }
            }
            System.out.println();
        }

    }
}