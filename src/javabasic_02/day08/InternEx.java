package javabasic_02.day08;

/* intern() : 문자열 최적화 관리를 위한 메소드
문자열을 리터럴로 선언할 경우 내부적으로 String의 Intern() 메소드가 호출이 되면
해당 리터럴이 문자열 상수 pool 안에 존재하는지 확인
만약 존재하면 해당 pool의 리터럴을 리턴, 존재하지 않는다면 리터럴을 pool안에 집어넣고 새로운 주소값을 반환*/

// intern() : equals() 없이 문자열 비교 가능

public class InternEx {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'}).intern();

        System.out.println(str1 == str2);
        // 해당 코드의 의미는 무엇인가?

        String str3 = "Hi";
        String str4 = new String("Hi");

        str4 = str4.intern();
        System.out.println(str3 == str4);


    }
}
