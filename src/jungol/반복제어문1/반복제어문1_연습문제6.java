package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");
            num = sc.nextInt();
            System.out.println();

            if (num == 1) {
                System.out.println("입력하기를 선택하였습니다.\n");
            } else if (num == 2) {
                System.out.println("출력하기를 선택하였습니다.\n");
            } else if (num == 3) {
                System.out.println("삭제하기를 선택하였습니다.\n");
            } else if (num == 4) {
                System.out.println("끝내기를 선택하였습니다.");
                break;
            } else {
                System.out.println("잘못 입력하였습니다.\n");
            }
        }
    }
}