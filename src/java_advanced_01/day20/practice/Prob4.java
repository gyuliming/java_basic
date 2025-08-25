package java_advanced_01.day20.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
public class Prob4 {

    public static void main(String[] args) throws Exception {
        try {
            OutputStream os = new FileOutputStream("C:/study/java_basic/src/java_advanced_01/day20/practice/byte_output.txt");

            os.write('A');
            os.write('B');
            os.write('C');
            os.write('D');
            os.write('E');
            os.write('F');

            os.flush();

            os.close();

            System.out.println("저장완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
