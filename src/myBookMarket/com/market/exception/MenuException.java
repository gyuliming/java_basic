package myBookMarket.com.market.exception;

import myBookMarket.com.market.common.ErrorCode;

// 메인 메뉴 및 사용자 입력 관련
public class MenuException extends RuntimeException {
    private final ErrorCode error;

    public MenuException(ErrorCode error) {
        super(error.getMsg());
        this.error = error;
    }
}
