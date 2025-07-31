package javabasic_02.day07;

public class MemberTest {
    public static void main(String[] args) {
        Member gildong = new Member();

        gildong.name = "홍길동";
        gildong.age = 30;
        gildong.phoneNum = "010-1111-1111";
        gildong.email = "fc@naver.com";
        gildong.residence = "서울";
        gildong.weight = "57.6kg";

        System.out.printf("""
                        이름 : %s
                        나이 : %d
                        전화번호 : %s
                        이메일 : %s
                        거주지 : %s
                        몸무게 : %s
                        """,
                        gildong.name, gildong.age, gildong.phoneNum, gildong.email, gildong.residence, gildong.weight);
    }
}
