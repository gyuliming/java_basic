package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();

        // 음수 : str1 < str2, 0 : str1 == str2, 양수 : str1 > str2,
        int result = str1.compareTo(str2);

        if (result < 0) System.out.println(str2 + " 가(이) 더 큽니다." );
        else if (result > 0) System.out.println(str1 + " 가(이) 더 큽니다.");
        else System.out.println(str1 + "과 " + str2 + "는 같습니다.");

        if (str1.substring(0, 3).equals(str2.substring(0, 3))) System.out.println("앞의 세 문자가 같습니다.");
        else System.out.println("앞의 세 문자가 같지 않습니다.");

    }
}