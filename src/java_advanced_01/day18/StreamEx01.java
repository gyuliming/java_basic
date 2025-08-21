package java_advanced_01.day18;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx01 {

    public static void main(String[] args) {
        // 지금까지 컬렉션과 배열에 저장된 요소를 반복 처리하기 위해서는 for 문을 이용하거나
        // Iterator(반복자)를 이용했다.

        // List 컬렉션에서 저장되어 있는 요소(element)를 하나씩 처리하는 for 문
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }

        // 향상된 for 문을 이용하여 요소를 처리
        for (String item : list) {
            System.out.println(item);
        }

        // Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item); // 요소 처리 => 콘솔 창으로 요소의 값 확인
        }

        // Java8 부터 Stream 사용하여 요소들을 하나씩 흘리면서 처리하는 방법 제시
        // 병렬 처리(양방향)가 가능해서 속도가 빠르다.
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        // Set names 에 홍길동, 김나무, 김꽃분 3명의 회원 저장하고 회원의 이름을 Stream 을 이용하여 출력
        // 1. Set 컬렉션에 names 생성
        Set<String> names = new HashSet<>();
        // 2. names 에 회원의 이름 저장
        names.add("홍길동");
        names.add("김나무");
        names.add("김꽃분");
        // 3. names 에 Stream 방식을 통하여 요소(이름) 출력 처리
        Stream<String> stream1 = names.stream();
        stream1.forEach(System.out::println); // 정적 메소드 처리 방식 (out : static)
//      stream1.forEach(name -> System.out.println(name)); 람다식 사용
    }
}
