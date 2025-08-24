package myBookMarket.com.market.common;

public enum ErrorCode {
    INVALID_MENU_NUM("1부터 9까지의 숫자를 입력하세요."),

    INVALID_MENU_OPTION("올바르지 않은 메뉴 선택으로 종료합니다."),

    INVALID_EMPTY_CART("장바구니에 항목이 없습니다."),

    INVALID_RE_INPUT("다시 입력해 주세요"),

    INVALID_CHECK_ADMIN("관리자 정보가 일치하지 않습니다.");



    private String msg;

    ErrorCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}