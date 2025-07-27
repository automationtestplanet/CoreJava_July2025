package interview.questions;

public class CheckStringPalindrome {

	// String Palindrome -> java : avaj(not palindrome), abccba : abccba
	public static void checkPalindrome(String str) { // java
		String revStr = "";
		for (char eachChar : str.toCharArray()) { // avaj
			revStr = eachChar + revStr;
		}

		if (revStr.equals(str)) {
			System.out.println(str + " is a Palindorme");
		} else {
			System.out.println(str + " is not a Palindorme");
		}

	}

	public static void main(String[] args) {
		checkPalindrome("malayalam");
	}

}
