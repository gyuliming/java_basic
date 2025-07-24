package day02;

public class BooleanEx {
    public static void main(String[] args) {
        boolean stop = false;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        boolean result1, result2, result3, result4;
        int x = 30;
        result1 = (x == 20);
        result2 = (x != 20);
        result3 = (x > 0 && x < 30);
        result4 = (x < 0 || x >= 30);

        System.out.printf("%b %b %b %b\n", result1, result2, result3, result4);

    }
}
