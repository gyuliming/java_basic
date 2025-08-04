package javabasic_02.day09.methodBasic;

import java.util.Scanner;

public class Calculator01 {
    // 입력기능을 위한 스캐너 기능
    static Scanner sc = new Scanner(System.in);

    // main
    public static void main(String[] args) {
        // 사용자에게 한 줄로 원하는 데이터를 입력받기     ex) 5 2 1
        menu();
        String inputData = sc.nextLine();
        int[] fixData = inputDataPro(inputData);

        switch (fixData[2]) {
            case 1 -> adder(fixData);
            case 2 -> minus(fixData);
            case 3 -> multi(fixData);
            case 4 -> div(fixData);
        }

    }

    // 사용자 입력 데이터 처리 기능 : public static int[] inputDataPro(String inputData);
    public static int[] inputDataPro(String inputData) {
        String[] splitData = inputData.split(" ");
        int data1 = Integer.parseInt(splitData[0]);
        int data2 = Integer.parseInt(splitData[1]);
        int data3 = Integer.parseInt(splitData[2]);

        int[] datas = new int[] {data1, data2, data3};
        return datas;
    }

    // menu 기능
    public static void menu() {
        System.out.println("""
                ================================================
                                사칙연산 계산기
                ================================================
                1. 덧셈   2. 뺄셈   3. 곱셈   4. 나눗셈  5. 종료
                
                두 수를 차례로 입력하고 사칙연산의 메뉴 숫자를 입력해 주세요.
                """);
    }

    // 사칙연산 기능
    public static void adder(int[] datas) {
        System.out.println(datas[0] + datas[1]);
    }

    public static void minus(int[] datas) {
        System.out.println(datas[0] - datas[1]);
    }

    public static void multi(int[] datas) {
        System.out.println(datas[0] * datas[1]);
    }

    public static void div(int[] datas) {
        try {
            int result = datas[0] / datas[1];
            System.out.println(result);
        } catch(Exception e) {
            System.out.println("0으로 나누기 금지");
        }
    }

}
