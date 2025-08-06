package javabasic_02.day11.inheritance.test0806.test02;

public class Employee {
    private String name;
    private int age;
    private String dept;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void print() {
        System.out.printf("이    름 : %-8s 나  이 : %-8d 부    서 : %-8s\n", getName(), getAge(), getDept());
    }
}
