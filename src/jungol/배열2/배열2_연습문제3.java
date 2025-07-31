package jungol.배열2;

public class 배열2_연습문제3 {

    public static void main(String[] args) {
        int[] arr = new int[100];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.println("피보나치 수열 10항 : " + arr[9]);
        System.out.println("피보나치 수열 20항 : " + arr[19]);
        System.out.println("피보나치 수열 30항 : " + arr[29]);
        System.out.println("피보나치 수열 40항 : " + arr[39]);
    }
}