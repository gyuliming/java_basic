package javabasic_02.day11.inheritance.test0806.test02;

public class Student {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print() {
        System.out.printf("이    름 : %-8s 나  이 : %-8d 학    번 : %-8d\n", getName(), getAge(), getId());
    }
}
