package java_advanced_01.day16.unmodifiable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ImmutableEx {

    public static void main(String[] args) {
        // List 불변 컬렉션 생성
        List<String> list = List.of("Apple", "Banana", "Pear", "Orange");
        // list.add("Grape"); list 는 불변 컬렉션이라 add 불가능
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        // 배열로부터 수정할 수 없는 List 컬렉션 생성
        String[] arr = new String[] {"Apple", "Banana", "Pear", "Orange"};
        List<String> list2 = List.of(arr);
        List<String> list3 = Arrays.asList(arr); // 배열을 List 타입으로 캐스팅

        // Map 불변 컬렉션 생성
        Map<String, Integer> map = Map.of("Apple", 10000, "Banana", 2500, "Pear", 3000, "Orange", 5000);
        for (String s : map.keySet()) {
            System.out.println(s + " : " + map.get(s));
        }
        System.out.println();
    }
}
