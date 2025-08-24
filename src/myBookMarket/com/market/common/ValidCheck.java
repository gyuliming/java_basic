package myBookMarket.com.market.common;

import myBookMarket.com.market.cart.Cart;
import myBookMarket.com.market.exception.CartException;
import myBookMarket.com.market.exception.MenuException;

public class ValidCheck {
    private static final String MENU_NUMBER = "^[1-9]$";

    //메인 메뉴 1-9번 유효 검사
    public void isMenuValid(String menuNum)  {
        if (!(menuNum.matches(MENU_NUMBER))) {
            throw new MenuException(ErrorCode.INVALID_MENU_NUM);
        }
    }

    public void isCartEmpty(Cart mCart) {
        if (mCart.mCartCount == 0) {
            throw new CartException(ErrorCode.INVALID_EMPTY_CART);
        }
    }


}

