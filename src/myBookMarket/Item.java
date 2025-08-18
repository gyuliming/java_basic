package myBookMarket;

// 장바구니 항목 관리 추상 클래스
public abstract class Item {
    String bookId;
    String name;
    int unitPrice;

    public Item(String bookId, String name, int unitPrice) {
        this.bookId = bookId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    abstract String getBookId();

    abstract String getName();

    abstract int getUnitPrice();

    abstract void setBookId(String bookId);

    abstract void setName(String name);

    abstract void setUnitPrice(int unitPrice);
}
