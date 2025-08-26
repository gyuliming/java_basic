package myBookMarket.com.market.exception;

import myBookMarket.com.market.common.ErrorCode;

// 장바구니 관련
public class CartException extends RuntimeException {
    private final ErrorCode error;

    public CartException(ErrorCode error) {
        super(error.getMsg());
        this.error = error;
    }
}
