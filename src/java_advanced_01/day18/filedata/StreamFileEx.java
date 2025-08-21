package java_advanced_01.day18.filedata;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// data.txt 파일에 대해 한 행씩 읽고 상품 정보 출력
public class StreamFileEx {

    public static void main(String[] args) throws URISyntaxException, IOException {
        // data.txt 파일의 경로(Path) 객체 얻기
        Path path = Paths.get(StreamFileEx.class.getResource("data.txt").toURI());

        // path 로 부터 파일을 열고 한 행씩 읽으면서 문자열 스트림 생성, 기본 문자셋(UTF-8)으로 읽기
        Stream<String> stream = Files.lines(path, Charset.defaultCharset()); // UTF-8
//      stream.forEach(System.out::println);
        stream.forEach(line -> System.out.println(line));
        stream.close(); // nio 는 close() 를 반드시 해줘야 함
    }
}
