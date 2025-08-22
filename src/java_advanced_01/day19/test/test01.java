package java_advanced_01.day19.test;

import java.util.Arrays;
import java.util.List;

public class test01 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 2, 1, 3, 6, 6, 8, 5);

        // 1. 정수 리스트에서 짝수를 필터링하는 자바 스트림 연산 작성
        List<Integer> evenNums = integerList.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        System.out.println(evenNums);
        System.out.println();

        // 2. 리스트의 각 정수를 제곱하기 위해 map 연산을 사용하여 연산 결과 출력
        List<Integer> squareNums = integerList.stream()
                .map(num -> (int) Math.pow(num, 2))
                .toList();
        System.out.println(squareNums);
        System.out.println();

        // 3. 문자열 리스트에서 중복 요소를 제거하기 위해 distinct 연산을 사용하여 결과 출력
        List<Integer> noDuplicationNums = integerList.stream()
                .distinct()
                .toList();
        System.out.println(noDuplicationNums);
        System.out.println();

        // 4. 스트림을 사용하여 정수 리스트를 오름차순으로 출력
        List<Integer> sortNums = integerList.stream()
                .sorted()
                .toList();
        System.out.println(sortNums);
        System.out.println();

        // 5. 정수 리스트에서 리스트의 모든 짝수의 합을 구하여 출력
        System.out.println(integerList.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num)
                .sum());
    }
}
