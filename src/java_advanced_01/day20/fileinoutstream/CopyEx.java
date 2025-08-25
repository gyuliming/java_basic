package java_advanced_01.day20.fileinoutstream;

// 파일 복사 기능 : FileInputStream 읽은 바이트를 바로 FileOutStream 으로 출력 가능

import java.io.*;

public class CopyEx {

    public static void main(String[] args) throws IOException {
        String originalFileName = "C:/study/java_basic/src/java_advanced_01/day20/test.jpg";
        String newFileName = "C:/study/java_basic/src/java_advanced_01/day20/testCopy.jpg";

        // InputStream, OutputStream 객체 생성 => 파일을 대상으로 입출력 스트림 생성
        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(newFileName);

//         이미지 객체의 데이터를 바이트 읽는다.
//        byte[] buffer = new byte[1024]; // 가용치 만큼 배열 생성(is.available)
//        while(true) {
//            int numRead = is.read(buffer);
//            if (is.read(buffer) == -1) break;
//            os.write(buffer, 0, numRead);
//        }
        // java9 부터 입력 스트림에서 출력 스트림으로 바이트를 복사하는 메소드 제공 :  transferTo()
        is.transferTo(os);

        // 내부 버퍼 비우기(출력 스트림만 flush)
        os.flush();

        // 스트림 닫기
        is.close();
        os.close();

        System.out.println(newFileName + " 복사 완료");
    }
}
