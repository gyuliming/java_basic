package java_advanced_01.day20.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx02 {

    public static void main(String[] args) throws IOException {

        // 바이트 배열을 통째로 출력 하는 경우가 대부분
        try {
            // 1. 출력 스트림 생성
            // 데이터 도착지를 test2.db 바이트 출력 스트림 생성
            OutputStream os = new FileOutputStream("C:/study/java_basic/src/java_advanced_01/day20/test2.db");

            // 2. 내보낼 데이터 지정
            byte[] array = {10, 20, 30, 40, 50};

            // 3. 데이터를 스트림에 보내서 해당 목적지에 쓰기 -> 배열의 모든 바이트를 출력
            os.write(array);

            // 4. 스트림 버퍼 비우기 (내부 버퍼에 잔류하는 바이트 출력 후 버퍼 비우기)
            os.flush();

            // 5. 스트림 닫기
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
