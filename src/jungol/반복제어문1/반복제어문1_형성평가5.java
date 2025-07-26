package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_형성평가5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Base, Height;
        double width;

        while (true) {

            System.out.print("Base = ");
            Base = sc.nextInt();
            System.out.print("Height = ");
            Height = sc.nextInt();
            width = Base * Height / 2.0;
            System.out.println("Triangle width = " + width);

            System.out.print("Continue? ");
            char Ans = sc.next().charAt(0);

            if (Ans != 'Y' && Ans != 'y') {
                break;
            }


        }
    }
}