package jungol.배열2;

public class 배열2_형성평가6 {

    public static void main(String[] args) {
        int[][] arr = new int[5][5]; // 5x5 배열
        int temp = 0; // 왼쪽 끝 값 및 오른쪽 끝 값

        // 1행의 1, 3, 5열 1로 초기화
        arr[0][0] = 1;
        arr[0][2] = 1;
        arr[0][4] = 1;

        // 2행부터 위행의 왼쪽과 오른쪽의 값 더하기
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                switch(j) {
                    case 0: arr[i][j] = temp + arr[i - 1][j + 1];
                            break;
                    case 4: arr[i][j] = arr[i - 1][j - 1] + temp;
                            break;
                    default: arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];
                            break;
                }
            }
        }

        // 배열 출력
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}