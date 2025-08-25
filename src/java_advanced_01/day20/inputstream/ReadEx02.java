package java_advanced_01.day20.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx02 {

    public static void main(String[] args) throws IOException {
        try {
            // 1. 리소스 객체를 대상으로 입력 스트림을 생성
            InputStream is = new FileInputStream("C:/study/java_basic/src/java_advanced_01/day20/test2.db");

            byte[] array = new byte[100];

            // 2. 리소소의 데이터가 존재한다면 읽어온다.
            while (true) {
                int data = is.read(array); // 최대 100byte 를 읽고, 읽은 바이트는 array 저장, 읽은 바이트 수 만큼 정수 값 리턴
                // 파일의 끝 : EOF(End Of File) => -1 리턴
                if (data == -1) break;
                for (int i = 0; i < data; i++) {
                    System.out.println(array[i]);
                }
            }

            // 3. 다 읽었으면 입력 스트림 닫기
            is.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
