package java_advanced_01.day17.AnonymousClass.class05;

public class Main {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        Calculator calculator = new Calculator(num1, num2);

        // 람다식
        Operate operate = (n1, n2) -> n1 + n2;

        int result = calculator.calculate(operate);
        System.out.println(result);
    }
}
