package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_형성평가7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d. %s\n", i + 1, arr[i]);
        }

    }
}
