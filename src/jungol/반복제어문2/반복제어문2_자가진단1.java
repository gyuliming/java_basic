package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_자가진단1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);

        for(int i = 1; i <= 20; i++) {
            System.out.print(c);
        }
    }
}
