package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] ch = new char[3][5];

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                ch[i][j] = sc.next().charAt(0);
            }
            System.out.println();
        }

        for (char[] chars : ch) {
            for (char aChar : chars) {
                System.out.print(Character.toLowerCase(aChar) + " ");
            }
            System.out.println();
        }

    }
}