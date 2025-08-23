package java_advanced_01.day19.homework.prob05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//문제 : 아래와 같이  문자열 리스트가 주어졌을때 자바스트림을 사용하여 쉼표로 구분된 단일 문자열로(Collectors.joining() API 참조하여 적용해보기)
// 연결하여 스트링으로 수집한 후 결과를 출력하세요
public class Prob05 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Are", "Powerful");

        // Joining() : Returns a Collector that concatenates the input elements into a String, in encounter order.
        // Collectors.joining()
        String newWord1 = words.stream()
                .collect(Collectors.joining());
        System.out.println("Collectors.joining() 사용 : " + newWord1);

        // Collectors.joining(delimiter) : 구분자
        String newWord2 = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Collectors.joining(delimiter) 사용 : " + newWord2);

        // Collectors.joining(delimiter, prefix, suffix) : 구분자, 접두사, 접미사
        String newWord3 = words.stream()
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println("Collectors.joining(delimiter, prefix, suffix) 사용 : " + newWord3);

    }
}
