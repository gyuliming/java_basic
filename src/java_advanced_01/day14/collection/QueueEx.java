package java_advanced_01.day14.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<>(); // Integer형 queue 선언
        Queue<String> queue_str = new LinkedList<>(); // String형 queue 선언

        // 데이터(객체) 추가
        queue_int.add(1);
        queue_int.add(2);
        queue_int.add(3);
        queue_int.add(4);

//        System.out.println(queue_int.offer(2)); // 요소 2 추가
        System.out.println(queue_int.remove(2)); // 요소 2 제거
        System.out.println(queue_int);
        queue_int.poll(); // 맨 앞 값 반환
        System.out.println(queue_int);

    }
}
