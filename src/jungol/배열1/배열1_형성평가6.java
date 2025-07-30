package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};
        int index = -1;

        char ch = sc.next().charAt(0);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                index = i;
                System.out.println(i);
            }
        }

        if (index == -1) System.out.println("none");

    }
}