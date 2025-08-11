package javabasic_02.day12.string_assignment3;

public class FindNumbers {

	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();

		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
	}

	public int countNumber(long number, int i) {
        int count = 0;
        String newI = Long.toString(number);

        for (int j = 0; j < newI.length(); j++) {
            if (Character.getNumericValue(newI.charAt(j)) == i) count++;
        }

        return count;
    }

}
