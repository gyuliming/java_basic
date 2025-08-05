package javabasic_02.day10.morningtest;

// 싱글톤 패턴 : 단 하나의 유일한 객체를 만들기 위한 코드

class ShopService {
    private static final ShopService shopService = new ShopService();

    public static ShopService getInstance() {
        return shopService;
    }

    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();
        if(obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
