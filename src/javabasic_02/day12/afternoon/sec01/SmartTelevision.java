package javabasic_02.day12.afternoon.sec01;

public class SmartTelevision implements RemoteControl, Searchable {

    @Override
    public void turnOn() {
        System.out.println("TV 전원 ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원 OFF");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "검색");
    }
}
