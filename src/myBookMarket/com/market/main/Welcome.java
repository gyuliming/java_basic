package myBookMarket.com.market.main;

import myBookMarket.com.market.cart.Cart;
import myBookMarket.com.market.bookitem.Book;
import myBookMarket.com.market.member.Admin;
import myBookMarket.com.market.member.User;
import myBookMarket.com.market.exception.CartException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Welcome {
    static boolean loop = false; // main - while 문 루프 설정
    static final int NUM_BOOK = 3; // 책의 개수 = 3
    static final int NUM_ITEM = 7; // 항목 개수 = 7(ID, 제목, 가격, 저자, 부제목, 장르, 날짜)
    static Cart mCart = new Cart();
    static User mUser; // 유저

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Book> mBookList;
        int mTotalBook = 0;

        // 개인 정보 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        int userMobile = sc.nextInt();

        // 입력한 개인정보를 토대로 User 객체 생성
        mUser = new User(userName, userMobile);

        while (!loop) {
            menuIntroduction(); // 메뉴판

            try {
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
                        case 4 -> {
                            mTotalBook = totalFileToBookList();
                            mBookList = new ArrayList<>();
                            menuCartAddItem(mBookList);
                        }
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
            } catch (CartException e) {
                System.out.println(e.getMessage());
                loop = true;
            } catch (Exception e) {
                System.out.println("올바르지 않은 메뉴 선택으로 종료합니다.");
                loop = true;
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
        if (mCart.mCartCount >= 0) {
            mCart.printCart();
        }
    }

    // 3. 장바구니 비우기(전체)
    public static void menuCartClear() throws CartException {
        if (mCart.mCartCount == 0) throw new CartException("장바구니에 항목이 없습니다.");
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
    public static void menuCartAddItem (ArrayList<Book> booklist){
        // 저장된 도서 정보 출력
        BookList(booklist);

        mCart.printBookList(booklist);

        boolean quit = false;

        while (!quit) {
            System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            boolean flag = false;
            int numId = -1;

            for (int i = 0; i < booklist.size(); i++) {
                if (input.equals(booklist.get(i).getBookId())) {
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
                    System.out.println(booklist.get(numId).getBookId() + " 도서가 장바구니에 추가되었습니다.");
                    // 장바구니에 넣기
                    if (!isCartInBook(booklist.get(numId).getBookId())) mCart.insertBook(booklist.get(numId));
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
    public static void menuCartRemoveItem () throws CartException {
        if (mCart.mCartCount == 0) throw new CartException("장바구니에 항목이 없습니다");
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
                    if (str.equals(mCart.mCartItem.get(i).getBookID())) {
                        numId = i;
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N ");
                    str = sc.nextLine();
                    if (str.toUpperCase().equals("Y")) {
                        System.out.println(mCart.mCartItem.get(numId).getBookID() + "장바구니에서 도서가 삭제되었습니다.");
                        mCart.removeCart(numId);
                    }
                    quit = true;
                } else System.out.println("다시 입력해 주세요");
            }
        }
    }

    // 7. 영수증 표시하기
    public static void menuCartBill() throws CartException {
        if(mCart.mCartCount == 0) throw new CartException("장바구니에 항목이 없습니다.");
        else {
            System.out.println("배송받을 분은 고객 정보와 같습니까? Y | N");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.toUpperCase().equals("Y")) {
                System.out.println("배송지를 입력해주세요 ");
                String address = sc.nextLine();
                printBill(mUser.getName(), String.valueOf(mUser.getPhone()), address);
            } else {
                System.out.println("배송받을 고객명을 입력하세요 ");
                String name = sc.nextLine();
                System.out.println("배송받을 고객의 연락처를 입력하세요 ");
                String phone = sc.nextLine();
                System.out.println("배송받을 고객의 배송지를 입력해주세요 ");
                String address = sc.nextLine();
            }
        }
    }

    // 배송을 위한 고객 정보(이름, 연락처, 주소)와 영수증 출력
    public static void printBill(String name, String phone, String address) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = sdf.format(date);
        System.out.println();
        System.out.println("------------배송받을 고객 정보------------");
        System.out.println("고객명: " + name + "  \t\t연락처: " + phone);
        System.out.println("배송지: " + address + "  \t\t발송일: " + strDate);

        mCart.printCart();

        int sum = 0;
        for (int i = 0; i < mCart.mCartCount; i++) sum += mCart.mCartItem.get(i).getTotalPrice();

        System.out.println("\t\t\t주문 총금액 : " + sum + "원\n");
        System.out.println("---------------------------------------");
        System.out.println();
    }

    // 8. 종료
    public static void menuExit () {
        System.out.println("8. 종료");
    }

    // 9. 관리자 로그인
    public static void menuAdminLogin () {
        System.out.println("관리자 정보를 입력하세요");

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 : ");
        String adminId = sc.next();

        System.out.print("비밀번호 : ");
        String adminPW = sc.next();

        Admin admin = new Admin(mUser.getName(), mUser.getPhone());
        if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
            String[] writeBook = new String[7];
            System.out.println("도서 정보를 추가하겠습니까? Y | N");
            String str = sc.next();

            if (str.toUpperCase().equals("Y")) {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyMMddhhmmss");
                String strDate = sdf.format(date);
                writeBook[0] = "ISBN" + strDate;
                System.out.println("도서ID : " + writeBook[0]);
                String str1 = sc.nextLine();
                System.out.print("도서명 : ");
                writeBook[1] = sc.nextLine();
                System.out.print("가격 : ");
                writeBook[2] = sc.nextLine();
                System.out.print("저자 : ");
                writeBook[3] = sc.nextLine();
                System.out.print("설명 : ");
                writeBook[4] = sc.nextLine();
                System.out.print("분야 : ");
                writeBook[5] = sc.nextLine();
                System.out.print("출판일 : ");
                writeBook[6] = sc.nextLine();

                try {
                    FileWriter fw = new FileWriter("book.txt", true);

                    for (int i = 0; i < 7; i++) {
                        fw.write(writeBook[i]+"\n");
                        fw.close();
                        System.out.println("새 도서 정보가 저장되었습니다.");
                    }
                    } catch(Exception e) {
                    System.out.println(e);
                }
            } else {
                System.out.println("이름 " + admin.getName() + "   연락처 " + admin.getPhone());
                System.out.println("아이디 " + admin.getId() + "   비밀번호 " + admin.getPassword());
            }
        } else
            System.out.println("관리자 정보가 일치하지 않습니다.");
    }

    public static boolean isCartInBook (String bookId){
        return mCart.isCartInBook(bookId);
    }

    // 도서 정보 저장
    public static void BookList (ArrayList<Book> booklist){
        setFileToBookList(booklist);
    }

    // 파일에서 도서의 개수를 얻는 메소드
    public static int totalFileToBookList() {
        try {

            FileReader fr = new FileReader("book.txt");
            BufferedReader reader = new BufferedReader(fr);

            String str;
            int num = 0;
            while ((str = reader.readLine()) != null) {
                if (str.contains("ISBN")) ++num;
            }

            reader.close();
            fr.close();
            return num;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    // 파일에서 도서 정보 목록을 읽어 배열에 저장하는 메소드
    public static void setFileToBookList(ArrayList<Book> booklist) {
        try {
            FileReader fr = new FileReader("book.txt");
            BufferedReader reader = new BufferedReader(fr);

            String str2;
            String[] readBook = new String[7];

            while ((str2 = reader.readLine()) != null) {
                if (str2.contains("ISBN")) {
                    readBook[0] = str2;
                    readBook[1] = reader.readLine();
                    readBook[2] = reader.readLine();
                    readBook[3] = reader.readLine();
                    readBook[4] = reader.readLine();
                    readBook[5] = reader.readLine();
                    readBook[6] = reader.readLine();
                }
                Book bookitem = new Book(readBook[0], readBook[1], Integer.parseInt(readBook[2]), readBook[3], readBook[4], readBook[5], readBook[6]);
                booklist.add(bookitem);
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}