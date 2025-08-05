package javabasic_02.day10.morningtest;

public class Member {
    String name;
    String id;
    String password;
    int age;

    Member() {}

    Member (String name, String id) {
        this.name = name;
        this.id = id;
    }
    public static void main(String[] args) {
        Member member = new Member();
        Member user = new Member("홍길동", "hong");

        System.out.println(user.toString());
        System.out.println(user.name);
        System.out.println(user.id);
        System.out.println(user.age);
        System.out.println(user.password);
    }
}
