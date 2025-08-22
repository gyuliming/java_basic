package java_advanced_01.day19.optionalEx;

import java.util.Optional;

public class OptionalEx02 {

    public static void main(String[] args) {
        String str = "Hello Optional"; // str 에 null 값이 아닌 문자열을 할당
        Optional<String> optStr = Optional.of(str); // Optional 타입으로 Wrapping
        System.out.println(optStr); // of() : 값이 null 이 아닌 경우에만 Optional 객체 생성

        String nullStr = null;
        Optional<String> optNullStr = Optional.ofNullable(nullStr);
        System.out.println(optNullStr);

        Optional<String> emptyOptional = Optional.empty(); // 값을 갖지 않는 빈 Optional 객체 생성
        System.out.println(emptyOptional);
    }
}
