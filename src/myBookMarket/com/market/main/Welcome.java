package myBookMarket.com.market.main;

import myBookMarket.com.market.common.ValidCheck;
import myBookMarket.com.market.common.Text;
import myBookMarket.com.market.common.ErrorCode;
import myBookMarket.com.market.cart.Cart;
import myBookMarket.com.market.bookitem.Book;
import myBookMarket.com.market.member.Admin;
import myBookMarket.com.market.member.User;
import myBookMarket.com.market.exception.CartException;
import myBookMarket.com.market.exception.MenuException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Welcome {
    private static ValidCheck validCheck = new ValidCheck();
    static Scanner sc = new Scanner(System.in);
    static SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
    static SimpleDateFormat sdf2 = new SimpleDateFormat("yyMMddhhmmss");
    static boolean loop = false; // main - while 문 루프 설정
    static int mTotalBook = 0;
    static Cart mCart = new Cart();
    static User mUser; // 유저
    static ArrayList<Book> mBookList = new ArrayList<>();

    public static void main(String[] args) {
        mUser = userSetting();
        run();
    }

    // 처음 유저 세팅
    public static User userSetting() {
        // 개인 정보 입력
        System.out.print(Text.NAME.getText());
        String userName = sc.nextLine();
        System.out.print(Text.MOBILE.getText());
        int userMobile = sc.nextInt();

        // 입력한 개인정보를 토대로 User 객체 생성
        return new User(userName, userMobile);
    }

    // 루프 메소드
    public static void run() {
        while (!loop) {
            menuIntroduction(); // 메뉴

            try {
                System.out.println(Text.MENU_SELECT.getText());
                String menuNum = sc.nextLine();

                validCheck.isMenuValid(menuNum);
                // 번호선택
                switch (menuNum) {
                    // 1. 고객 정보 확인하기
                    case "1" -> menuGuestInfo(mUser.getName(), mUser.getPhone());

                    // 2. 장바구니 상품 목록 보기
                    case "2" -> menuCartItemList();

                    // 3. 장바구니 비우기(전체)
                    case "3" -> menuCartClear();

                    // 4. 바구니에 항목 추가하기
                    case "4" -> {
                        menuCartAddItem(mBookList);
                    }

                    // 5. 장바구니의 항목 수량 줄이기
                    case "5" -> menuCartRemoveItemCount();

                    // 6. 장바구니의 항목 삭제하기
                    case "6" -> menuCartRemoveItem();

                    // 7. 영수증 표시하기
                    case "7" -> menuCartBill();

                    // 8. 종료
                    case "8" -> menuExit();

                    // 9. 관리자 로그인
                    case "9" -> menuAdminLogin();
                }
            } catch (CartException | MenuException e) {
                System.out.println(e.getMessage());
                loop = true;
            }
        }
    }

    // 메인 메뉴
    public static void menuIntroduction() {
        System.out.println(Text.BORDER_LINE.getText());
        System.out.println(Text.HEADER.getText());
        System.out.println(Text.BORDER_LINE.getText());
        System.out.println(Text.MAIN_MENU.getText());
    }

    // 1. 고객 정보 확인하기
    public static void menuGuestInfo(String name, int mobile) {
        System.out.println(Text.CURRENT_USERINFO.getText());
        System.out.print(Text.USER_NAME.getText() + name + " " + Text.USER_MOBILE.getText() + mobile);
    }

    // 2. 장바구니 상품 목록 보기
    public static void menuCartItemList() {
        validCheck.isCartEmpty(mCart);
        mCart.printCart();
    }

    // 3. 장바구니 비우기(전체)
    public static void menuCartClear() {
        validCheck.isCartEmpty(mCart);
        System.out.println(Text.CART_DELETE_CONFIRM.getText());
        String str = sc.nextLine();

        if (str.toUpperCase().equals("Y")) {
            System.out.println(Text.CART_DELETE_ACCEPT.getText());
            mCart.deleteBook();
        }
    }

    // 4. 장바구니에 항목 추가하기
    public static void menuCartAddItem (ArrayList<Book> booklist){
        mTotalBook = totalFileToBookList();
        // 저장된 도서 정보 출력
        BookList(booklist);

        mCart.printBookList(booklist);

        boolean quit = false;

        while (!quit) {
            System.out.println(Text.ITEM_ADD_ID.getText());
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
                System.out.println(Text.ITEM_ADD_CONFIRM.getText());
                input = sc.nextLine();

                // "y" or "Y"
                if (input.toUpperCase().equals("Y")) {
                    System.out.println(booklist.get(numId).getBookId() + Text.ADD_CART.getText());
                    // 장바구니에 넣기
                    if (!isCartInBook(booklist.get(numId).getBookId())) mCart.insertBook(booklist.get(numId));
                }
                quit = true;
            } else
                System.out.println(ErrorCode.INVALID_RE_INPUT.getMsg());
        }
    }

    // 5. 장바구니의 항목 수량 줄이기
    public static void menuCartRemoveItemCount () {

    }

    // 6. 장바구니의 항목 삭제하기
    public static void menuCartRemoveItem () {
        validCheck.isCartEmpty(mCart);

        menuCartItemList();
        boolean quit = false;
        while (!quit) {
            System.out.println(Text.DELETE_ID.getText());
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
                System.out.println(Text.ITEM_DELETE_CONFIRM.getText());
                str = sc.nextLine();
                if (str.toUpperCase().equals("Y")) {
                    System.out.println(mCart.mCartItem.get(numId).getBookID() + Text.DELETE_CART.getText());
                    mCart.removeCart(numId);
                }
                quit = true;
            } else System.out.println(ErrorCode.INVALID_RE_INPUT.getMsg());
        }
    }

    // 7. 영수증 표시하기
    public static void menuCartBill() throws CartException {
        validCheck.isCartEmpty(mCart);
        System.out.println(Text.USERINFO_CONFIRM.getText());
        String str = sc.nextLine();

        if (str.toUpperCase().equals("Y")) {
            System.out.println(Text.ENTER_ADDRESS.getText());
            String address = sc.nextLine();
            printBill(mUser.getName(), String.valueOf(mUser.getPhone()), address);
        } else {
            System.out.println(Text.ENTER_NAME.getText());
            String name = sc.nextLine();
            System.out.println(Text.ENTER_MOBILE.getText());
            String phone = sc.nextLine();
            System.out.println(Text.ENTER_ADDRESS.getText());
            String address = sc.nextLine();
        }
    }

    // 배송을 위한 고객 정보(이름, 연락처, 주소)와 영수증 출력
    public static void printBill(String name, String phone, String address) {
        Date date = new Date();
        String strDate = sdf1.format(date);
        System.out.println();
        System.out.println(Text.VIP_INFO.getText());
        System.out.println(Text.VIP_NAME.getText() + name + Text.VIP_MOBILE.getText() + phone);
        System.out.println(Text.VIP_ADDRESS.getText() + address + Text.VIP_SHIP_DATE.getText() + strDate);

        mCart.printCart();

        int sum = 0;
        for (int i = 0; i < mCart.mCartCount; i++) sum += mCart.mCartItem.get(i).getTotalPrice();

        System.out.println(Text.TOTAL_PRICE.getText() + sum + "원\n");
        System.out.println(Text.BORDER_LINE.getText());
        System.out.println();
    }

    // 8. 종료
    public static void menuExit () {
        System.out.println(Text.MENU_EXIT.getText());
    }

    // 9. 관리자 로그인
    public static void menuAdminLogin () {
        System.out.println(Text.ENTER_ADMIN.getText());

        Scanner sc = new Scanner(System.in);
        System.out.print(Text. ADMIN_ID.getText());
        String adminId = sc.next();

        System.out.print(Text. ADMIN_PW.getText());
        String adminPW = sc.next();

        Admin admin = new Admin(mUser.getName(), mUser.getPhone());
        if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
            String[] writeBook = new String[7];
            System.out.println(Text.ADD_BOOK_CONFIRM.getText());
            String str = sc.next();

            if (str.toUpperCase().equals("Y")) {
                Date date = new Date();
                String strDate = sdf2.format(date);
                writeBook[0] = Text.BOOK_ISBN.getText() + strDate;
                System.out.println(Text.BOOK_ID.getText() + writeBook[0]);
                String str1 = sc.nextLine();
                System.out.print(Text.BOOK_NAME.getText());
                writeBook[1] = sc.nextLine();
                System.out.print(Text.BOOK_PRICE.getText());
                writeBook[2] = sc.nextLine();
                System.out.print(Text.BOOK_AUTHOR.getText());
                writeBook[3] = sc.nextLine();
                System.out.print(Text.BOOK_DESCRIPTION.getText());
                writeBook[4] = sc.nextLine();
                System.out.print(Text.BOOK_CONTENT.getText());
                writeBook[5] = sc.nextLine();
                System.out.print(Text.BOOK_RELEASE_DATE.getText());
                writeBook[6] = sc.nextLine();

                try {
                    FileWriter fw = new FileWriter("book.txt", true);

                    for (int i = 0; i < 7; i++) {
                        fw.write(writeBook[i]+"\n");
                        fw.close();
                        System.out.println(Text.SAVED_BOOK.getText()    );
                    }
                    } catch(Exception e) {
                    System.out.println(e);
                }
            } else {
                System.out.println(Text.USER_NAME.getText() + admin.getName() + Text.USER_MOBILE + admin.getPhone());
                System.out.println(Text.USER_ID.getText() + admin.getId() + Text.USER_PW.getText() + admin.getPassword());
            }
        } else
            System.out.println(ErrorCode.INVALID_CHECK_ADMIN.getMsg());
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