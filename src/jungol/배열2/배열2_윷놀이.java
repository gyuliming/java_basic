package jungol.배열2;

import java.util.Scanner;

public class 배열2_윷놀이 {
    // 배 : 0, 등 : 1 - 윷(배 4개), 모(등 4개)
    // 도 : A, 개 : B, 걸 : C, 윷 : D, 모 : E
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;

        int[][] game = new int[3][4];

        for (int i = 0; i < game.length; i++) {
            count = 0;
            for (int j = 0; j < game[i].length; j++) {
                game[i][j] = sc.nextInt();

                if (game[i][j] == 0) count += 1;
            }

            switch (count) {
                case 0 -> System.out.println("E");
                case 1 -> System.out.println("A");
                case 2 -> System.out.println("B");
                case 3 -> System.out.println("C");
                case 4 -> System.out.println("D");
            }
        }

    }
}