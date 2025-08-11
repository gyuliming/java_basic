package javabasic_02.day12.string_assignment2;

public class Prob1 {

	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스");
		System.out.println("-------------Sample 1 --------------");
		String str1=myReplace("hello world",'l','*');
		System.out.println(str1);

		System.out.println("-------------Sample 2 --------------");
		String str2=myReplace("hello world",' ','-');
		System.out.println(str2);

		System.out.println("-------------Sample 3 --------------");
		String str3=myReplace("hello world",'a','*');
		System.out.println(str3);


	}

	public static String myReplace(String str, char oldChar, char newChar) {
		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

			if (arr[i] == oldChar) arr[i] = newChar;
		}

		return String.valueOf(arr);
	}


}