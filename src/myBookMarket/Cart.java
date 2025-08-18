package myBookMarket;

// 장바구니 처리 클래스
public class Cart implements CartInterface {
    static final int NUM_BOOK = 3;
    CartItem[] mCartItem = new CartItem[NUM_BOOK];
    static int mCartCount = 0;

    public Cart() {

    }

    // 전체 도서 정보 목록 출력
    @Override
    public void printBookList(Book[] booklist) {
        for (int i = 0; i < booklist.length; i++) {
            System.out.println(booklist[i].getBookId() + " | ");
            System.out.println(booklist[i].getName() + " | ");
            System.out.println(booklist[i].getUnitPrice() + " | ");
            System.out.println(booklist[i].getAuthor() + " | ");
            System.out.println(booklist[i].getDescription() + " | ");
            System.out.println(booklist[i].getCategory() + " | ");
            System.out.println(booklist[i].getReleaseDate() + " | ");
            System.out.println("");
        }
    }

    // 장바구니에 담긴 도서의 ID와 장바구니에 담을 도서의 ID 비교 -> 일치 O : +1, true / 일치 X : false
    @Override
    public boolean isCartInBook(String id) {
        return false;
    }

    // 장바구니 항목 관리 클래스 CartItem 에 도서 정보 등록
    @Override
    public void insertBook(Book book) {
        mCartItem[mCartCount++] = new CartItem(book);
    }

    // 장바구니 순번 numId의 항목 삭제
    @Override
    public void removeCart(int numId) {
        CartItem[] cartItem = new CartItem[NUM_BOOK];
        int num = 0;

        for (int i = 0; i < mCartCount; i++) {
            if (numId != i) cartItem[num++] = mCartItem[i];

            mCartCount = num;
            mCartItem = cartItem;
        }
    }

    // 장바구니의 모든 항목 삭제
    @Override
    public void deleteBook() {
        mCartItem = new CartItem[NUM_BOOK];
        mCartCount = 0;
    }

    public void printCart() {
        System.out.print("""
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
    }

    // 장바구니가 비어있는지 확인
    public boolean isCartInBook(String bookId) {
        boolean flag = false;

        for (int i = 0; i < mCartCount; i++) {
            if (bookId == mCartItem[i].getBookID()) {
                mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
                flag = true;
            }
        }
        return flag;
    }
}
