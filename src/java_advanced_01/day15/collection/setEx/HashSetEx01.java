package java_advanced_01.day15.collection.setEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx02 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        // 객체 저장
        set.add("JAVA");
        set.add("JDBC");
        set.add("JSP"); // 저장 O
        set.add("JSP"); // 저장 X (HashCode 값과 equals()의 값이 같아서 중복으로 판단)
        set.add("Spring");

        int size = set.size();
        System.out.println(size);
    }
}
