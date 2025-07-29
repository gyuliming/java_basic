package jungol.배열1;

//4의 배수에서 (100의 배수가 아닌 수) 또는 (400의 배수)}인 해가 윤년
import java.util.Scanner;

public class 배열1_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month;

        do {
            System.out.print("YEAR = ");
            year = sc.nextInt();
            System.out.print("MONTH = ");
            month = sc.nextInt();

            switch (month) {
                case 0:
                    break;

                case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // 윤년
                        int[] arr = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                        System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", arr[month - 1]);

                    } else { // 평년
                        int[] arr = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                        System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", arr[month - 1]);
                    }
                    break;

                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        } while (month != 0);

    }
}
