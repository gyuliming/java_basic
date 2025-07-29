package jungol.반복제어문3;

import java.util.Scanner;

//A B C
//D E 0
//F 1 2
public class 반복제어문3_형성평가7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int ch = 64;
        int d = 0;

        while(true) {
            n = sc.nextInt();

            if (0 < n && n <= 6) {
                break;
            }
            System.out.println("1~6의 수를 입력하세요.");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print((char)++ch + " ");
            }

            for (int k = 1; k < i; k++) {
                System.out.print(d++ + " ");
            }
            System.out.println();
        }

    }
}