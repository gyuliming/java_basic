package java_advanced_01.day19.filterEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterEx {

    public static void main(String[] args) {
        // List 컬렉션 ArrayList 생성
        // list에 5명의 이름을 저장
        List<String> list = new ArrayList<>();
        list.add("신세계");
        list.add("신세계");
        list.add("Java");
        list.add("김민성");
        list.add("김민서");

        List<String> list1 = Arrays.asList(
                new String("신명성"),
                new String("초신성"),
                new String("김주림")
        );

        list.stream().forEach(System.out::println);

        System.out.println();

        // 중복요소 제거 : distinct
        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        // list1에서 중복을 제거하고 "신"이 들어가는 이름만 출력
        list1.stream()
                .distinct()
                .filter(str -> str.contains("신"))
                .forEach(System.out::println);

        System.out.println();

        // list1에서 중복을 제거하고 "신"씨 이름만 출력
        list1.stream()
                .distinct()
                .filter(str -> str.startsWith("신"))
                .forEach(System.out::println);
    }
}
