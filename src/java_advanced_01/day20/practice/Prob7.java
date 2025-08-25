package java_advanced_01.day20.practice;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
import java.io.File;

public class Prob7 {
    public static void main(String[] args) {
        File file = new File("C:/study/java_basic/src/java_advanced_01/day20/practice/copy.jpg");

        if (file.exists()) {
            long size = file.length();
            System.out.println("파일 크기 : " + size + " bytes");
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
