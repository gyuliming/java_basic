package javabasic_02.day09.methodBasic;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int result = 0;
        result = computer.totalSum(1, 2, 3);
        System.out.println(result);

        result = computer.totalSum(1, 2, 3, 4, 5);
        System.out.println(result);

        int[] values = {1, 2, 3, 4, 5};
        result = computer.totalSum(values);
        System.out.println(result);

        result = computer.totalSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(result);

    }
}
