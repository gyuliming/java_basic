package java_advanced_01.day20.practice;

import java.io.FileInputStream;
import java.io.InputStream;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:/study/java_basic/src/java_advanced_01/day20/practice/byte_output.txt");

        while(true) {
            int data = is.read();
            if (data == -1) break;
            System.out.print((char) data);
        }

        is.close();
    }
}
