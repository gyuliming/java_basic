package javabasic_02.day12.string_assignment3;


public class FindCharacters {


	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);

	}
	public int countChar(String str, char c) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) count++;
		}

		return count;
	}
}
