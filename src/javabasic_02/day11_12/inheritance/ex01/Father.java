package javabasic_02.day11_12.inheritance.ex01;

public class Father {
    public String familyName = "아버지";
    public String houseAddress = "인천";

    public void getFamilyName() {
        System.out.println("나의 " + familyName + "는 프로그래머");
    }

    public void getHouseAddress() {
        System.out.println("나의 집은 " + houseAddress);
    }
}
