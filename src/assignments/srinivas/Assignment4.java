package assignments.srinivas;

public class Assignment4 {

	// Write a program to server a string without reversing the special characters
	// Ex: He#l&lo -> ol#l&eH

	public static void reverseStringWithoutSpecialCharacters(String str) {

		char[] chararray = str.toCharArray();
		char[] alphabetarray = new char[chararray.length];
		int j = 0;
		for (int i = (chararray.length) - 1; i >= 0; i--) {
			if (Character.isAlphabetic(chararray[i])) {
				alphabetarray[j] = chararray[i];
				j++;
			}
		}
		j = 0;
		for (int i = 0; i <= chararray.length - 1; i++) {
			if (Character.isAlphabetic(chararray[i])) {
				chararray[i] = alphabetarray[j];
				j++;
			}
		}
		System.out.println(chararray);
	}

	public static void main(String args[]) {
		reverseStringWithoutSpecialCharacters("He#l&lo");

	}

}
