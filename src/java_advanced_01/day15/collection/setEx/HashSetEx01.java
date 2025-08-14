package java_advanced_01.day15.collection.setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        // 객체 저장
        set.add(new Member("신세계", 30));
        set.add(new Member("신세계", 20));
        set.add(new Member("신세종", 30));

        int size = set.size();
        System.out.println(size);

        // iterator 적용
        Iterator<Member> iterator = set.iterator();

        // while
        while(iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println("이름 : " + member.name + ", 나이 : " + member.age);
        }
        System.out.println("------------------------");

        // for
        for (Member member : set) {
            System.out.println("이름 : " + member.name + ", 나이 : " + member.age);
        }
    }
}
