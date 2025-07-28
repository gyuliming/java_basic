package jungol.입력;

import java.util.Scanner;

public class 입력_자가진단8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char ch = sc.next().charAt(0);

        System.out.printf("%.2f\n%.2f\n%c", num1, num2, ch);
    }
}
