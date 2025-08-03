package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}
