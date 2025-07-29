package day05;

public class WhileEx01 {

    public static void main(String[] args) {
        // 1부터 10까지 출력하는 프로그램 - while문 사용
        int loop = 1;
        int total = 0;

        while(loop <= 100) {
            total += loop;
            loop++;
        }
        System.out.println("1-100의 합 = " + total);
    }
}
