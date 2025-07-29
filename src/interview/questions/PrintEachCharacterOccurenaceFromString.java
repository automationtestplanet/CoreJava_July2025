package interview.questions;

public class PrintEachCharacterOccurenaceFromString {

	// display each character count from the string: java -> j=1,1=2,v=1
	public static void printEachCharOccurenaceFromString(String str) { // java
		while (str.length() > 0) {
			char ch = str.charAt(0);
			int count = 0;

			for (char eachChar : str.toCharArray()) {
				if (ch == eachChar) {
					count++;
				}
			}
			System.out.println(ch + " : " + count);
			str = str.replaceAll(String.valueOf(ch), "");
		}
	}

	public static void main(String[] args) {
		// display each character count from the string: java -> j=1,a=2,v=1
		printEachCharOccurenaceFromString("java");
	}

}
