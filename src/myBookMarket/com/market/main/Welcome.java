package myBookMarket;

import myBookMarket.com.market.bookitem.Book;
import myBookMarket.com.market.member.Admin;
import myBookMarket.com.market.member.User;

import java.util.Scanner;

public class Welcome {
    static boolean loop = true; // main - while 문 루프 설정
    static final int NUM_BOOK = 3; // 책의 개수 = 3
    static final int NUM_ITEM = 7; // 항목 개수 = 7(ID, 제목, 가격, 저자, 부제목, 장르, 날짜)
    //    static CartItem[] mCartItem = new CartItem[NUM_BOOK];
//    static int mCartCount = 0;
    static Cart mCart = new Cart();
    static User mUser; // 유저

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];
        Book[] mBookList = new Book[NUM_BOOK];

        // 개인 정보 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        int userMobile = sc.nextInt();

        // 입력한 개인정보를 토대로 User 객체 생성
        mUser = new User(userName, userMobile);

        while (loop) {
            menuIntroduction(); // 메뉴판

            System.out.print("메뉴 번호를 선택해주세요 ");
            int num = sc.nextInt();

            if (num < 1 || num > 9) System.out.println("1부터 9까지의 숫자를 입력하세요.");
            else {
                // 번호선택
                switch (num) {
                    // 1. 고객 정보 확인하기
                    case 1 -> menuGuestInfo(userName, userMobile);
                    // 2. 장바구니 상품 목록 보기
                    case 2 -> menuCartItemList();
                    // 3. 장바구니 비우기(전체)
                    case 3 -> menuCartClear();
                    // 4. 바구니에 항목 추가하기
                    case 4 -> menuCartAddItem(mBookList);
                    // 5. 장바구니의 항목 수량 줄이기
                    case 5 -> menuCartRemoveItemCount();
                    // 6. 장바구니의 항목 삭제하기
                    case 6 -> menuCartRemoveItem();
                    // 7. 영수증 표시하기
                    case 7 -> menuCartBill();
                    // 8. 종료
                    case 8 -> menuExit();
                    // 9. 관리자 로그인
                    case 9 -> menuAdminLogin();
                }
            }

        }
    }

    // 메뉴판
    public static void menuIntroduction() {
        System.out.print("""
                ***********************************************
                \tWelcome to Shopping Mall
                \tWelcome to book Market!
                ******************************
                1. 고객 정보 확인하기 \t\t4. 바구니에 항목 추가하기
                2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기
                3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기
                7. 영수증 표시하기 \t\t8. 종료
                9. 관리자 로그인
                ******************************
                """);
    }

    // 1. 고객 정보 확인하기
    public static void menuGuestInfo(String name, int mobile) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + name + " 연락처 " + mobile);
    }

    // 2. 장바구니 상품 목록 보기
    public static void menuCartItemList() {
        /*System.out.print("""
                장바구니 상품 목록:
                ---------------------------------------
                    도서ID \t|     수량 \t|      합계
                """);

        for (int i = 0; i < mCartCount; i++) {
            System.out.print("    " + mCartItem[i].getBookID() + " \t| ");
            System.out.print("    " + mCartItem[i].getQuantity() + " \t| ");
            System.out.print("    " + mCartItem[i].getTotalPrice());
            System.out.println("  ");
        }
        System.out.println("---------------------------------------");
    }*/
        if (mCart.mCartCount >= 0) {
            mCart.printCart();
        }
    }

    // 3. 장바구니 비우기(전체)
    public static void menuCartClear() {
        if (mCart.mCartCount == 0) System.out.println("장바구니에 항목이 없습니다.");
        else {
            System.out.println("장바구니의 모든 항목을 삭제하겠습니까?");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            if (str.toUpperCase().equals("Y")) {
                System.out.println("장바구니의 모든 항목을 삭제했습니다.");
                mCart.deleteBook();
            }
        }
    }

    // 4. 장바구니에 항목 추가하기
    public static void menuCartAddItem (Book[] booklist){
        // 저장된 도서 정보 출력
        BookList(booklist);

/*        // 도서 정보 출력
        for (int i = 0; i < NUM_BOOK; i++) {
            for (int j = 0; j < NUM_ITEM; j++) {
                System.out.print(book[i][j] + " | ");
            }
            System.out.println(" ");
        }*/
        mCart.printBookList(booklist);

        boolean quit = false;

        while (!quit) {
            System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            boolean flag = false;
            int numId = -1;

            for (int i = 0; i < NUM_BOOK; i++) {
                if (input.equals(booklist[i].getBookId())) {
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("장바구니에 추가하시겠습니까? Y | N ");
                input = sc.nextLine();

                // "y" or "Y"
                if (input.toUpperCase().equals("Y")) {
                    System.out.println(booklist[numId].getBookId() + " 도서가 장바구니에 추가되었습니다.");
                    // 장바구니에 넣기
                    if (!isCartInBook(booklist[numId].getBookId())) mCart.insertBook(booklist[numId]);
//                        mCartItem[mCartCount++] = new CartItem(book[numId]);
                }
                quit = true;
            } else
                System.out.println("다시 입력해 주세요");
        }
    }

    // 5. 장바구니의 항목 수량 줄이기
    public static void menuCartRemoveItemCount () {

    }

    // 6. 장바구니의 항목 삭제하기
    public static void menuCartRemoveItem () {
        if (mCart.mCartCount == 0) System.out.println("장바구니에 항목이 없습니다");
        else {
            menuCartItemList();
            boolean quit = false;
            while (!quit) {
                System.out.println("장바구니에서 삭제할 도서의 ID를 입력하세요.");
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                boolean flag = false;
                int numId = -1;

                for (int i = 0; i < mCart.mCartCount; i++) {
                    if (str.equals(mCart.mCartItem[i].getBookID())) {
                        numId = i;
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N ");
                    str = sc.nextLine();
                    if (str.toUpperCase().equals("Y")) {
                        System.out.println(mCart.mCartItem[numId].getBookID() + "장바구니에서 도서가 삭제되었습니다.");
                        mCart.removeCart(numId);
                    }
                    quit = true;
                } else System.out.println("다시 입력해 주세요");
            }
        }
    }

    // 7. 영수증 표시하기
    public static void menuCartBill () {

    }

    // 8. 종료
    public static void menuExit () {
        System.out.println("8. 종료");
    }

    // 9. 관리자 로그인
    public static void menuAdminLogin () {
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

    public static boolean isCartInBook (String bookId){
       /* boolean flag = false;

        for (int i = 0; i < mCartCount; i++) {
            if (bookId == mCartItem[i].getBookID()) {
                mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
                flag = true;
            }
        }
        return flag;*/
        return mCart.isCartInBook(bookId);
    }

    // 도서 정보 저장
    public static void BookList (Book[] booklist){
        booklist[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000);
        booklist[0].setAuthor("송미영");
        booklist[0].setDescription("단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍");
        booklist[0].setCategory("IT전문서");
        booklist[0].setReleaseDate("2018/10/08");

        booklist[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000);
        booklist[1].setAuthor("우재남");
        booklist[1].setDescription("실습 단계별 명쾌한 멘토링!");
        booklist[1].setCategory("IT전문서");
        booklist[1].setReleaseDate("2022/01/22");

        booklist[2] = new Book("ISBN1236", "스크래치", 22000);
        booklist[2].setAuthor("고광일");
        booklist[2].setDescription("컴퓨팅 사고력을 키우는 블록 코딩");
        booklist[2].setCategory("컴퓨터입문");
        booklist[2].setReleaseDate("2019/06/10");
    }
}