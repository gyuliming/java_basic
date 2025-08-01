package jungol.문자열1;

public class 문자열1_연습문제5 {

    public static void main(String[] args) {
        String str = "우리나라 대한민국!";
        char[] arr = str.toCharArray();

        for (char s : arr) {
            System.out.print(s);
        }

        System.out.printf("\n위 문자열의 길이는 %d입니다.", arr.length);

    }
}