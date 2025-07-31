package assignments.srinivas;

public class Assignment3 {

	// Write a reusable code to check two string anagrams or not
	// listen == silent, heart == earth, racecar == carrace
	public static void checkGivenStringsAnagramsOrNot(String firstString, String secondString)

	{
		char tempChar = ' ';
		char tempChar1 = ' ';

		if (firstString.length() != secondString.length()) {
			System.out.println("Given strings are not anagrams");
		} else {
			firstString = firstString.toLowerCase();
			secondString = secondString.toLowerCase();
			char[] chars1 = firstString.toCharArray();
			char[] chars2 = secondString.toCharArray();
			for (int i = 0; i < chars1.length; i++) {
				for (int j = i + 1; j < chars1.length; j++) {
					if (chars1[i] > chars1[j]) {
						tempChar = chars1[i];
						chars1[i] = chars1[j];
						chars1[j] = tempChar;

					}
					if (chars2[i] > chars2[j]) {
						tempChar1 = chars2[i];
						chars2[i] = chars2[j];
						chars2[j] = tempChar1;

					}
				}

			}

			String str1 = String.copyValueOf(chars1);

			String str2 = String.copyValueOf(chars2);

			if (str1.equals(str2))
				System.out.println("Given strings are anagram");
			else
				System.out.println("Given strings are not anagrams");
		}
	}

	public static void main(String args[]) {
		checkGivenStringsAnagramsOrNot("Silent", "listen");
	}
}
