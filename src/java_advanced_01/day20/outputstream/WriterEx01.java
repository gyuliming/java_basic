package java_advanced_01.day20.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx01 {

    public static void main(String[] args) throws IOException {
        try {
            // 1. 출력 스트림 생성 C:/study/java_basic/src/java_advanced_01/day20/test1.db에 1byte 데이터 저장
            // 디렉토리까지는 존재해야 생성 가능
            OutputStream os = new FileOutputStream("C:/study/java_basic/src/java_advanced_01/day20/test1.db");

            // 2. 내보낼 데이터 지정
            byte num1 = 10;
            byte num2 = 20;
            byte num3 = 30;

            // 3. 데이터를 스트림에 보내서 해당 목적지에 쓰기 -> 1byte 씩 출력
            os.write(num1);
            os.write(num2);
            os.write(num3);

            // 4. 스트림 버퍼 비우기 (내부 버퍼에 잔류하는 바이트 출력 후 버퍼 비우기)
            os.flush();

            // 5. 스트림 닫기
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
