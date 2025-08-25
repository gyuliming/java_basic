package java_advanced_01.day20.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {

    public static void main(String[] args) throws IOException {
        try {
            // 1. 리소스 객체를 대상으로 입력 스트림을 생성
            InputStream is = new FileInputStream("C:/study/java_basic/src/java_advanced_01/day20/test1.db");

            // 2. 리소소의 데이터가 존재한다면 읽어온다.
            while (true) {
                int data = is.read();
                // 파일의 끝 : EOF(End Of File) => -1 리턴
                if (data == -1) break;
                System.out.println(data);
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
