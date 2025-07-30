package jungol.도형만들기2;

import java.util.Scanner;

// 높이(n)는 100이하의 자연수, 종류(m)는 1부터 3사이의 자연수

public class 별삼각형1_1523 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        n = sc.nextInt();
        m = sc.nextInt();

        if ((n < 1 || n > 100) || (m < 1 || m > 3)) {
            System.out.println("INPUT ERROR!");
        } else {
            switch (m) {
                case 1: // 종류1
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2: // 종류2
                    for (int i = 1; i <= n; i++) {
                        for (int j = n; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // 종류3
                    for (int i = 1; i <= n; i++) {
                        for (int j = n; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k < 2 * i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

            }
        }

    }
}

