package javabasic_02.day08;

public class RefEx03 {

    public static void main(String[] args) {
        // 리터럴 저장 방식 : String constant pool 영역에 저장
        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1 == str2);

        // new 연산자 저장 방식 : Heap 영역에 저장
        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3 == str4); // 주소값 비교
        System.out.println(str3.equals(str4)); // 저장값 비교

        // 문자열 데이터를 어떤 방식으로 저장하느냐에 따라 메모리 적재형태가 다름

        System.out.println("-----리터럴과 객체 문자열 비교-----");
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
