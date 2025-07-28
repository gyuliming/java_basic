package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int even = 0;
        int odd = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.printf("even : %d\nodd : %d", even, odd);
    }
}
