package myBookMarket.com.market.common;

public enum Text {
    NAME("당신의 이름을 입력하세요 : "),
    MOBILE("연락처를 입력하세요 : "),
    MENU_SELECT("메뉴 번호를 선택해주세요 : "),

    HEADER("""
            \tWelcome to Shopping Mall
            \tWelcome to book Market!
            """),
    BORDER_LINE("*".repeat(60)),
    MAIN_MENU("""
                1. 고객 정보 확인하기 \t\t4. 바구니에 항목 추가하기
                2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기
                3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기
                7. 영수증 표시하기 \t\t8. 종료
                9. 관리자 로그인
            """),

    CURRENT_USERINFO("현재 고객 정보 : "),

    CART_DELETE_CONFIRM("장바구니의 모든 항목을 삭제하겠습니까? "),
    CART_DELETE_ACCEPT("장바구니의 모든 항목을 삭제했습니다."),

    ITEM_ADD_ID("장바구니에 추가할 도서의 ID를 입력하세요 : "),
    ITEM_ADD_CONFIRM("장바구니에 추가하시겠습니까? Y | N "),
    ADD_CART(" 도서가 장바구니에 추가되었습니다."),
//    RE_INPUT("다시 입력해 주세요"),

//    EMPTY_CART("장바구니에 항목이 없습니다"),
    DELETE_ID("장바구니에서 삭제할 도서의 ID를 입력하세요."),
    ITEM_DELETE_CONFIRM("장바구니의 항목을 삭제하겠습니까? Y | N "),
    DELETE_CART("장바구니에서 도서가 삭제되었습니다."),

    USERINFO_CONFIRM("배송받을 분은 고객 정보와 같습니까? Y | N"),
    ENTER_ADDRESS("배송지를 입력해주세요 "),
    ENTER_NAME("배송받을 고객명을 입력하세요 "),
    ENTER_MOBILE("배송받을 고객의 연락처를 입력하세요 "),

    VIP_INFO("------------배송받을 고객 정보------------"),
    TOTAL_PRICE("\t\t\t주문 총금액 : "),
    VIP_NAME("고객명: "),
    VIP_MOBILE("\t\t연락처: "),
    VIP_ADDRESS("배송지: "),
    VIP_SHIP_DATE("\t\t발송일: "),

    MENU_EXIT("""
            ###################
            프로그램을 종료합니다.
            ###################
            """),

    ENTER_ADMIN("관리자 정보를 입력하세요"),
    ADMIN_ID("아이디 : "),
    ADMIN_PW("비밀번호 : "),
    ADD_BOOK_CONFIRM("도서 정보를 추가하겠습니까? Y | N"),

    BOOK_ISBN("ISBN"),
    BOOK_ID("도서ID : "),
    BOOK_NAME("도서명 : "),
    BOOK_PRICE("가격 : "),
    BOOK_AUTHOR("저자 : "),
    BOOK_DESCRIPTION("설명 :"),
    BOOK_CONTENT("분야 : "),
    BOOK_RELEASE_DATE("출판일 : "),
    SAVED_BOOK("새 도서 정보가 저장되었습니다."),

    USER_NAME("이름 "),
    USER_MOBILE("연락처 "),
    USER_ID("아이디 "),
    USER_PW("비밀번호 ");

//    MISMATCH_ADMIN("관리자 정보가 일치하지 않습니다.");

    private final String text;

    Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
