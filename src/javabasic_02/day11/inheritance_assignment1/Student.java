package javabasic_02.day11.inheritance_assignment1;

public class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    public void calcReturnFee() {
        if (subject.equals("javaprogram")) this.returnFee = fee * 0.25;
        else if (subject.equals("jspprogram")) this.returnFee = fee * 0.20;
        else {
            System.out.println("그런 과정명은 없습니다.\n");
            this.returnFee = 0;
        }
    }

    public void print() {
        if (returnFee > 0) System.out.printf("%s 씨의 과정명은 %s 이고 교육비는 %d 이며 환급금은 %.0f 입니다.\n", name, subject, fee, returnFee);
    }

public static void main(String args[]) {
    Student stu1 = new Student("장동건", "jspprogram", 500000);
    Student stu2 = new Student("차은우", "javaprogram", 450000);
    Student stu3 = new Student("카리나", "python", 300000);

    stu1.calcReturnFee();
	stu1.print();

    stu2.calcReturnFee();
    stu2.print();

    stu3.calcReturnFee();
    stu3.print();
    }
}