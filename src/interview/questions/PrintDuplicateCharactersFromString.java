package interview.questions;

public class PrintDuplicateCharactersFromString {

	// Write a program to display duplicate characters from string
	public static void printDuplicatesFromString(String str) { // java

//			for (char eachChar : str.toCharArray()) {
//				int count = 0;
		//
//				for (char eachChar2 : str.toCharArray()) {
//					if (eachChar == eachChar2) {
//						count++;
//					}
//				}
		//
//				if (count > 1) {
//					System.out.println(eachChar);
//				}
//			}

//			while (str.length() > 0) {
//				char ch = str.charAt(0);
		//
//				int count = 0;
		//
//				for (char eachChar : str.toCharArray()) {
//					if (ch == eachChar) {
//						count++;
//					}
//				}
		//
//				if (count > 1) {
//					System.out.println(ch);
//				}
//				str = str.replaceAll(String.valueOf(ch), "");
//			}

		while (str.length() > 0) {
			char ch = str.charAt(0);

			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
			str = str.replaceAll(String.valueOf(ch), "");
		}
	}

	public static void main(String[] args) {
		printDuplicatesFromString("java");
	}

}
