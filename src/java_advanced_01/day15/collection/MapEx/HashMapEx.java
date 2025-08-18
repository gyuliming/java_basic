package java_advanced_01.day15.collection.MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>(); // 키 : String 타입, 값 : Integer 타입

        // 객체 저장 (INSERT, CREATE, SAVE)
        map.put("A", 1);
        map.put("A", 1);
        map.put("A", 1); // 키가 A로 중복되서 hashCode()와 equals()에 의해 중복된 값으로 인식 => size 안 늘어남
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map.size()); // 4
        System.out.println();

        // 하나의 객체 읽기 (Read, Get) => Key 를 이용하여 읽기
        String key = "A";
        int value2 = map.get(key); // 키에 해당하는 값으로 1이 저장됨
        System.out.println("키를 이용하여 값 확인 : " + value2); // 1
        System.out.println();

        // Set 컬렉션을 얻고, 반복해서 키와 값을 읽기 => 모든 키를 Set 객체에 담아 리턴
        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator(); // 키를 반복하기 위해서 반복자 생성
        while (iterator.hasNext()) {
            String key1 = iterator.next();
            Integer value3 = map.get(key1);
            System.out.println(key1 + " : " + value3);
        }
        System.out.println();

        // 엔트리 Set 컬렉션을 얻고 반복해서 키와 값을 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " " + v);
        }
        System.out.println();

        // 동일
        for (Map.Entry<String, Integer> entry : entrySet) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " " + v);
        }
        System.out.println();

        // 키로 엔트리 삭제
        map.remove("D"); // D에 해당하는 엔트리 삭제
        System.out.println(map.size());
        System.out.println();
    }
}
