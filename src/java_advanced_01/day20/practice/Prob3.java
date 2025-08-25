package java_advanced_01.day20.practice;

import java.io.FileReader;
import java.io.Reader;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:/study/java_basic/src/java_advanced_01/day20/practice/hello.txt");
        int count = 0;
        while (true) {
            int num = reader.read();
            count++;
            if (num == -1) break;
        }
        System.out.println(count);

        reader.close();
    }
}
