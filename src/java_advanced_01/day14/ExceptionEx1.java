package java_advanced_01.day14;

public class ExceptionEx1 {

    public static void main(String[] args) {
        try {
            String[] array = {"100", "l00"};
            for (int i = 0; i < array.length; i++) {
                System.out.println(Integer.parseInt(array[i]));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        } catch (NumberFormatException e1) {
            e1.getMessage();
        }

        System.out.println("프로그램 종료");
        // array에서 값을 추출해서 숫자로 바꾸어 출력하려고 한다.
        // 해당 예외를 예측하여 예외 처리를 하세요.


    }
}
