package javabasic_02.day08.stringBufferEx;

// StringBuffer 주요 메소드

public class StringBufferEx {

    public static void main(String[] args) {
        String str = "abcdefg";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("초기상태 : " + sb);

        // StringBuffer를 String 타입으로 변환
        System.out.println("초기상태 : "+ sb.toString());

        // sb에서 "cd" 출력
        System.out.println("문자열 추출 : " + sb.substring(2,4));

        // sb index 2에 "추가" 문자열 삽입
        System.out.println("문자 추가 : " + sb.insert(2, "추가"));

        // sb의 문자열 삭제
        System.out.println("문자 삭제 : " + sb.delete(2, 4));

        // sb에 문자 붙이기 : append()
        System.out.println("문자 붙이기 : " + sb.append("hijk"));

        // sb의 길이 확인 : length()
        System.out.println("문자열 길이 : " + sb.length());

        // buffer 용량 : capacity()
        System.out.println("용량 : " + sb.capacity());

        // 문자열의 역순 : reverse()
        System.out.println("역순 : " + sb.reverse());

        // 현재 상태 확인
        System.out.println("마지막 상태 체크 : " + sb);
    }
}
