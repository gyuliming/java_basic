package javabasic_01.day04;

public class IfEx01 {

    public static void main(String[] args) {
        // score 변수에 93점을 저장한다.
        // 현재 scroe 변수의 값이 90점 이상이면 A
        // 90점 미만이면 Fail 출력

        int score = 93;
        if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("Fail");
        }

    }
}
