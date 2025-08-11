package javabasic_02.day12.string_assignment1;

import java.util.Scanner;

public class Prob2 {
 
	public static void main(String[] args) {
		String inputStr;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		inputStr = keyboard.nextLine();

		char[] arr = new char[inputStr.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = inputStr.charAt(i);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(Character.toUpperCase(arr[i]));
		}

	}

}
