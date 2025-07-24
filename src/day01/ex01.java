package day01;

public class ex01 {
    public static void main(String[] args) {
        int num1, num2, num3, sum;

        num1 = 10;
        num2 = 11;
        num3 = 12;

        sum = num1 + num2 + num3;

        System.out.println("10 + 11 + 12 = " + sum);
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
        System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum); // 자바에서 제공해주는 기능(=API)
    }
}
