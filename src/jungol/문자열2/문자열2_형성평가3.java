package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = new String[50];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();

            if (arr[i].equals("0")) break;
            count++;
        }

        System.out.println(count);
        for (int i = 0; i < count; i+=2) {
            System.out.println(arr[i]);
        }

    }
}
