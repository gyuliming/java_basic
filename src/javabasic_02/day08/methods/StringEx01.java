package javabasic_02.day08.methods;

public class StringEx01 {

    public static void main(String[] args) {
        // 1. 문자열을 하나 추출 : charAt() 사용
        String subject = "자바객체프로그래밍";
        char charValue = subject.charAt(0);
        System.out.println(charValue);

        String ssn = "9508211234567";
        char gender = ssn.charAt(6);
        switch (gender) {
            case '1': case '3':
                System.out.println("Male");
                break;
            case '2': case '4':
                System.out.println("Female");
                break;
        }

        // 2. 문자열 길이 : length()
        int length = ssn.length();
        System.out.println(length);

        // 3. 문자열 대체 : replace("before", "after")
        String oldStr = "신세계 자바 과정";
        System.out.println(oldStr);
        // oldStr의 문자열을 "자바" "자바 백엔드" 로 변경
        String newStr = oldStr.replace("자바", "자바 백엔드");
        System.out.println(newStr);

        // 4. 문자열 잘라내기 : substring(int beginIndex), substring(int beginIndex, int endIndex)
        String ssn1 = "880815-1234567";

        // - 기준으로 앞의 숫자 문자열과 뒤의 숫자 문자열을 분리하여 각각 분리 추출
        String firstNum = ssn1.substring(0, 6); // 6 포함X
        String secondNUm = ssn1.substring(7);
        System.out.println(firstNum);
        System.out.println(secondNUm);

        // 5. 문자열 찾기 : 문자열에서 특정 문자의 위치를 찾을 때 : indexOf()
        int index = subject.indexOf("프로그래밍");
        if (index == -1) System.out.println("포함되어 있지 않다.");
        else System.out.println("포함되어 있다.");

        System.out.println(index); // 포함O : 시작 인덱스, 포함X : -1

        // 6. 문자열의 포함 여부 확인 : contains()
        boolean result = subject.contains("프로그래밍");
        System.out.println(result);

        // ***7. 문자열 분리 : split() 여러 개의 문자열로 구성 시, 이를 따로 분리해서 문자열을 처리
        String board = "번호, 제목, 내용, 설명";
        String[] boardStr = board.split(", ");
        System.out.println(boardStr[0]);
        System.out.println(boardStr[1]);
        System.out.println(boardStr[2]);
        System.out.println(boardStr[3]);

        for (int i = 0; i < boardStr.length; i++) {
            System.out.print(boardStr[i] + " ");
        }
        System.out.println();

        for (String s : boardStr) {
            System.out.print(s + " ");
        }
    }
}
