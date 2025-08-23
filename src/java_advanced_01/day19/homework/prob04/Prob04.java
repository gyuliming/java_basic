package java_advanced_01.day19.homework.prob04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 주어진 정수리스트를 자바스트림을 사용하여 중복을 제거하고 정렬된 리스트로 반환하여 결과를 출력
public class Prob04 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 23, 43, 4,10,25,30,43,100,97,30);

        // 오름차순 정렬(default)
        List<Integer> newNumbers1 = numbers.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println("중복 제거 및 자연 정렬 : " + newNumbers1);

        // 내림차순 정렬
        List<Integer> newNumbers2 = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("중복 제거 및 역순 정렬 : " + newNumbers2);
    }
}
