package javabasic_02.day11.inheritance.test0806.test03;

public class Emp {
    private String id;
    private String name;
    private int baseSalary;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus) {
        return baseSalary + baseSalary * bonus;
    }

    public String toString() {
        return getName() + "(" + getId() + ") 사원의 기본급은 " + getBaseSalary() + "원 입니다.";
    }
}
