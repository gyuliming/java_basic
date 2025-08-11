package javabasic_02.day12.string_assignment1;

public class Prob1 {

	public static void main(String args[]) {

		Prob1 prob1 = new Prob1();

		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 5, '$') );
		System.out.println( prob1.leftPad("SDS", 2, '&') );

	}

	public String leftPad(String str, int size, char padChar) {
		String result;

		if (size >= str.length()) result = Character.toString(padChar).repeat(size - str.length()) + str;
		else result = str;

		return result;
	}

}
