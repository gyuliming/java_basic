package myBookMarket.com.market.cart;

import java.util.ArrayList;
import myBookMarket.com.market.bookitem.Book;

// 장바구니 처리 클래스
public class Cart implements CartInterface {
    // mCartItem : ArrayList 클래스를 이용하여 장바구니에 항목을 담는 객체 변수
    public ArrayList<CartItem> mCartItem = new ArrayList<CartItem>();

    // 장바구니에 담긴 항목의 총 개수 저장
    public static int mCartCount = 0;

    public Cart() {}

    // 전체 도서 정보 목록 출력
    @Override
    public void printBookList(ArrayList<Book> booklist) {
        for (int i = 0; i < booklist.size(); i++) {
            Book bookitem = booklist.get(i);
            System.out.println(bookitem.getBookId() + " | ");
            System.out.println(bookitem.getName() + " | ");
            System.out.println(bookitem.getUnitPrice() + " | ");
            System.out.println(bookitem.getAuthor() + " | ");
            System.out.println(bookitem.getDescription() + " | ");
            System.out.println(bookitem.getCategory() + " | ");
            System.out.println(bookitem.getReleaseDate() + " | ");
            System.out.println("");
        }
    }

    // 장바구니에 도서를 삽입하는 메소드
    @Override
    public void insertBook(Book book) {
        CartItem bookitem = new CartItem(book);
        mCartItem.add(bookitem);
        mCartCount = mCartItem.size();
    }

    // 장바구니 순번 numId의 항목 삭제
    @Override
    public void removeCart(int numId) {
        mCartItem.remove(numId);
        mCartCount = mCartItem.size();
    }

    // 장바구니의 모든 항목 삭제
    @Override
    public void deleteBook() {
        mCartItem.clear();
        mCartCount = 0;
    }

    public void printCart() {
        System.out.print("""
                장바구니 상품 목록:
                ---------------------------------------
                    도서ID \t|     수량 \t|      합계
                """);

        for (int i = 0; i < mCartItem.size(); i++) {
            System.out.print("    " + mCartItem.get(i).getBookID() + " \t| ");
            System.out.print("    " + mCartItem.get(i).getQuantity() + " \t| ");
            System.out.print("    " + mCartItem.get(i).getTotalPrice());
            System.out.println("  ");
        }
        System.out.println("---------------------------------------");
    }

    // 장바구니에 담긴 도서의 ID와 장바구니에 담을 도서의 ID 비교 -> 일치 O : +1, true / 일치 X : false
    // 장바구니가 비어있는지 확인
    public boolean isCartInBook(String bookId) {
        boolean flag = false;

        for (int i = 0; i < mCartItem.size(); i++) {
            if (bookId == mCartItem.get(i).getBookID()) {
                mCartItem.get(i).setQuantity(mCartItem.get(i).getQuantity() + 1);
                flag = true;
            }
        }
        return flag;
    }
}
