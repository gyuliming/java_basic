package jungol.반복제어문2;

public class 반복제어문2_연습문제2 {

    public static void main(String[] args) {
        int c = 65;
        for (int i = 1; i <= 26; i++) {
            System.out.printf("%c", c);
            c += 1;
        }


        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
