package java_advanced_01.day18;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamEx {

    public static void main(String[] args) {
        String[] strings = new String[]{"1","2","3","4","5"};
        Stream<String> stream = Arrays.stream(strings);
        stream.forEach(System.out::println);
//      stream.forEach(item -> System.out.println(item + " ")); 람다

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        Stream<Integer> intStream = Arrays.stream(integers);
        intStream.forEach(System.out::println);
//      intStream.forEach(item -> System.out.println(item + " ")); 람다
    }
}
