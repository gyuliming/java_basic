package myBookMarket;

// 장바구니 처리를 위한 메서드를 정의하기 위한 인터페이스
public interface CartInterface {
    // 전체 도서 정보 목록 출력
    void printBookList(Book[] p);

    // 장바구니에 담긴 도서의 ID와 장바구니에 담을 도서의 ID 비교 -> 일치 O : +1, true / 일치 X : false
    boolean isCartInBook(String id);

    // 장바구니 항목 관리 클래스 CartItem 에 도서 정보 등록
    void insertBook(Book p);

    // 장바구니 순번 numId의 항목 삭제
    void removeCart(int numId);

    // 장바구니의 모든 항목 삭제
    void deleteBook();
}
