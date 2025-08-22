package java_advanced_01.day19.filterEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bobi", "Charlie", "David", "Eve");

        // 1. 이름 중 "A"로 시작하는 이름을 수집하여 출력
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        for (String filteredName : filteredNames) {
            System.out.println(filteredName);
        }

        // 동일
        names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);


        List<String> names2 = Arrays.asList("Alice", "Bobi", "Charlie");

        // 2. 각 이름의 길이를 세어서 출력 => 결과 : [5, 4, 7]
         List<Integer> list = names2.stream()
                 .map(name -> name.length())
                 .collect(Collectors.toList());
        System.out.println(list);

        // 동일
        names2.stream().map(name -> name.length()).collect(Collectors.toList()).forEach(System.out::println);


    }
}
