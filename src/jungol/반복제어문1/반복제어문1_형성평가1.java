package jungol.반복제어문1;

import java.util.Scanner;


public class 반복제어문1_형성평가1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();
        int i = 1;

        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
    }
}