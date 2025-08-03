package jungol.문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_연습문제11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Double input1 = sc.nextDouble();
        Double input2 = sc.nextDouble();
        Double input3 = sc.nextDouble();

        // 소수 둘째자리까지 반올림 후 String 타입으로 변환
        String str1 = String.format("%.2f", Math.round(input1 * 100) / 100.0);
        String str2 = String.format("%.2f", Math.round(input2 * 100) / 100.0);
        String str3 = String.format("%.2f", Math.round(input3 * 100) / 100.0);

        // 소수점 기준으로 나누기
        String[] nums = (str1 + str2 + str3).split("\\.");

        Arrays.stream(nums).forEach(System.out::println);

    }
}