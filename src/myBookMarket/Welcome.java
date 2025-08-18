package bookmarket_pj;

import java.util.Scanner;

public class Welcome {
    static boolean loop = true;
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;
    static CartItem[] mCartItem = new CartItem[NUM_BOOK];
    static int mCartCount = 0;
    static User mUser;

    public static void menuIntroduction() {
        System.out.print("""
                **************************************************************
                                   Welcome to Shopping Mall
                                   Welcome to book Market!
                **************************************************************
                1. 고객 정보 확인하기           4. 바구니에 항목 추가하기
                2. 장바구니 상품 목록 보기      5. 장바구니의 항목 수량 줄이기
                3. 장바구니 비우기              6. 장바구니의 항목 삭제하기
                7. 영수증 표시하기              8. 종료
                9. 관리자 로그인
                **************************************************************   
                """);
        System.out.print("메뉴 번호를 선택해주세요 ");
    }

    // 1. 고객 정보 확인하기
    public static void menuGuestInfo(String name, String mobile) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + name + " 연락처 " + mobile);
    }

    // 2. 장바구니 상품 목록 보기
    public static void menuCartItemList() {

    }

    // 3. 장바구니 비우기
    public static void menuCartClear()  {

    }

    // 4. 바구니에 항목 추가하기
    public static void menuCartAddItem(String[][] book) {
        BookList(book);
        for (int i = 0; i < NUM_BOOK; i++) {
            for (int j = 0; j < NUM_ITEM; j++) {
                System.out.print(book[i][j] + " | ");
            }
            System.out.println(" ");
        }

        boolean quit = false;

        while (!quit) {
            System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            boolean flag = false;
            int numId = -1;

            for (int i = 0; i < NUM_BOOK; i++) {
                if (input.equals(book[i][0])) {
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("장바구니에 추가하시겠습니까? Y | N ");
                input = sc.nextLine();

                if (input.toUpperCase().equals("Y")) {
                    System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다.");
                }
                quit = true;
            } else
                System.out.println("다시 입력해주세요");

        }

    }

    // 5. 장바구니의 항목 수량 줄이기
    public static void menuCartRemoveItemCount() {

    }

    // 6. 장바구니의 항목 삭제하기
    public static void menuCartRemoveItem() {

    }

    // 7. 영수증 표시하기
    public static void menuCartBill() {

    }

    // 8. 종료
    public static void menuExit() {
        System.out.println("8. 종료");
    }

    // 9. 관리자 로그인
    public static void menuAdminLogin() {
        System.out.println("관리자 정보를 입력하세요");

        Scanner input = new Scanner(System.in);
        System.out.print("아이디 : ");
        String adminId = input.next();

        System.out.print("비밀번호 : ");
        String adminPW = input.next();

        Admin admin = new Admin(mUser.getName(), mUser.getPhone());
        if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
            System.out.println("이름 " + admin.getName() + "   연락처 " + admin.getPhone());
            System.out.println("아이디 " + admin.getId() + "   비밀번호 " + admin.getPassword());
        } else
            System.out.println("관리자 정보가 일치하지 않습니다.");
    }

    // 도서 정보 저장
    public static void BookList(String[][] book) {
        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2019/06/10";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

        // 개인 정보 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        int userMobile = sc.nextInt();

        mUser = new User(userName, userMobile);

        while (loop) {
            menuIntroduction(); // 메뉴판
            int num = sc.nextInt();

            if (num < 1 || num > 9) System.out.println("1부터 9까지의 숫자를 입력하세요.");
            else {
                // 번호선택
                switch (num) {
                    case 1 -> menuGuestInfo(userName, userMobile);
//                        System.out.println("현재 고객 정보:");
//                        System.out.println("이름: " + userName);
//                        System.out.println("연락처: " + userPhone);
                    case 2 -> menuCartItemList();
//                        System.out.println("장바구니 상품 목록 보기");
                    case 3 -> menuCartClear();
//                        System.out.println("장바구니 비우기");
                    case 4 -> menuCartAddItem(mBook);
//                        System.out.println("바구니에 항목 추가하기");
                    case 5 -> menuCartRemoveItemCount();
//                        System.out.println("장바구니의 항목 수량 줄이기");
                    case 6 -> menuCartRemoveItem();
//                        System.out.println("장바구니의 항목 삭제하기");
                    case 7 -> menuCartBill();
//                        System.out.println("영수증 표시하기");
                    case 8 -> menuExit();
//                        System.out.println("프로그램을 종료합니다.");
                    case 9 -> menuAdminLogin();
                }
            }

        }
    }
}