package jungol.입력;

import java.util.Scanner;

public class 입력_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y;

        System.out.print("yard? ");
        y = sc.nextDouble();

        System.out.printf("%.1fyard = %.1fcm", y, y*91.44);
    }
}
