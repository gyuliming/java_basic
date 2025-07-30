package javabasic_01.day05;

import java.util.Scanner;

public class ShoppingMall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, userPhone;
        int num;

        // 개인 정보 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        userPhone = sc.nextLine();

        // 메뉴판
        do {
            System.out.println("**************************************************************");
            System.out.println("            Welcome to Shopping Mall");
            System.out.println("            Welcome to book Market!");
            System.out.println("**************************************************************");
            System.out.println("1. 고객 정보 확인하기           4. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기      5. 장바구니의 항목 수량 줄이기");
            System.out.println("3. 장바구니 비우기              6. 장바구니의 항목 삭제하기");
            System.out.println("7. 영수증 표시하기              8. 종료");
            System.out.println("**************************************************************");
            System.out.print("메뉴 번호를 선택해주세요 ");
            num = sc.nextInt();

            // 번호선택
            switch (num) {
                case 1:
                    System.out.println("현재 고객 정보:");
                    System.out.println("이름: " + userName);
                    System.out.println("연락처: " + userPhone);
                    break;

                case 2:
                    System.out.println("장바구니 상품 목록 보기");
                    break;

                case 3:
                    System.out.println("장바구니 비우기");
                    break;

                case 4:
                    System.out.println("바구니에 항목 추가하기");
                    break;

                case 5:
                    System.out.println("장바구니의 항목 수량 줄이기");
                    break;

                case 6:
                    System.out.println("장바구니의 항목 삭제하기");
                    break;

                case 7:
                    System.out.println("영수증 표시하기");
                    break;

                case 8:
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("1~8의 숫자만 입력해주세요.");
                    break;
            }

        } while (num != 8);

    }
}