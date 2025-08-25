package java_advanced_01.day20.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

//문제 : 정수 배열 {5,10,15,20} 을 array.dat 에 저장한 후 다시 읽어 합계와 평균을 구하고 평균을 기준으로 정렬하여 콘솔에 출력하세요
public class Prob14 {
    public static void main(String[] args) throws Exception {
        // 1. 정수 배열 {5, 10, 15, 20} -> resource 저장 파일의 이름 지정
        int[] arr = new int[]{5, 10, 15, 20};
        String fileName = "array.dat";

        // 2. 배열을 파일에 저장 로직 구현
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(arr.length);
            for (int i = 0; i < arr.length; i++) {
                dos.writeInt(arr[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3. 저장한 파일에서 배열 읽기 로직 구현
        int[] readArray = null;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))){
            int length = dis.readInt();
            readArray = new int[length];

            for (int i = 0; i < length; i++) {
                readArray[i] = dis.readInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        int sum = 0;
        // 4. 배열에서 값을 모두 더하여 합계를 구하고 평균을 구한다.
        if(readArray != null) {
            sum = 0;
            for (int num : readArray) sum += num;
            double avg = sum / readArray.length;

            System.out.println("읽어온 배열 : " + Arrays.toString(readArray));
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + avg);
        }

    }
}
