package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("1. 삽입\n2. 수정\n3. 삭제");
        System.out.print("숫자를 선택하세요. ");
        num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("삽입을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("수정을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("삭제를 선택하셨습니다.");
                break;
        }
    }
}