package interview.questions;

public class PrintUniqueCharactersFromString {

	// Write a program to display Unique characters from string
	public static void printUniqueCharsFromString(String str) { // java

		while (str.length() > 0) {
			char ch = str.charAt(0);

			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
			str = str.replaceAll(String.valueOf(ch), "");
		}
	}

	public static void main(String[] args) {
		printUniqueCharsFromString("java");
	}

}
