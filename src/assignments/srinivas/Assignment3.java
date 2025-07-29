package assignments.srinivas;

public class Assignment3 {

	// Write a reusable code to check two string anagrams or not
	// listen == silent, heart == earth, racecar == carrace
	public static void checkGivenStringsAnagramsOrNot(String firstString, String secondString)

	{
		char tempChar = ' ';
		char tempChar1 = ' ';
		String str1 = " ";
		String str2 = " ";
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
				}
			}

			for (int k = 0; k < chars2.length; k++) {
				for (int l = k + 1; l < chars2.length; l++) {
					if (chars2[k] > chars2[l]) {
						tempChar1 = chars2[k];
						chars2[k] = chars2[l];
						chars2[l] = tempChar1;

					}
				}

			}
			

			for (int m = 0; m <= chars1.length-1; m++) {
				str1 = str1 + chars1[m];
			}
			for (int n = 0; n <= chars2.length-1; n++) {
				str2 = str2 + chars2[n];
			}

			if (str1.equals(str2))
				System.out.println("Given strings are anagram");
		}
	}

	public static void main(String args[]) {
		checkGivenStringsAnagramsOrNot("Silent", "listen");
	}
}
