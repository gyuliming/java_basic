package java_advanced_01.day20.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {

    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/study/java_basic/src/java_advanced_01/day20/practice/image.jpg";
        String newFileName = "C:/study/java_basic/src/java_advanced_01/day20/practice/copy.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(newFileName);

        byte[] buffer = new byte[1024]; // 가용치 만큼 배열 생성(is.available)
        while(true) {
            int numRead = is.read(buffer);
            if (is.read(buffer) == -1) break;
            os.write(buffer, 0, numRead);
        }

//        is.transferTo(os);

        os.flush();

        is.close();
        os.close();
    }
}
