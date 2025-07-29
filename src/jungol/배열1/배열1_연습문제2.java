package jungol.배열1;

public class 배열1_연습문제2 {

    public static void main(String[] args) {
        char[] arr = new char[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }

    }
}
