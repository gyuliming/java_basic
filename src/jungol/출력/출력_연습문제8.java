package jungol.출력;

public class 출력_연습문제8 {
    public static void main(String[] args) {
        String subject1, subject2, subject3;
        subject1 = "korean";
        subject2 = "english";
        subject3 = "computer";

        int score1, score2, score3;
        score1 = 90;
        score2 = 100;
        score3 = 80;

        System.out.println(" subject score");
        System.out.println("==============");
        System.out.printf("%8s%6d\n", subject1, score1);
        System.out.printf("%8s%6d\n", subject2, score2);
        System.out.printf("%8s%6d", subject3, score3);

    }
}
