package interview.questions;

public class ReverseString {

	// Reverse String -> Java : avaJ
	public static void reverseString(String str) { // java
//			String revStr = "";		
//			for(char eachChar : str.toCharArray()) {   // avaj
//				revStr = eachChar + revStr;
//			}		
//			System.out.println(str+ " Reverse string : "+ revStr);

		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) { // avaj
			revStr = revStr + str.charAt(i);
		}
		System.out.println(str + " Reverse string : " + revStr);
	}

	public static void main(String[] args) {
		reverseString("java");
	}

}
