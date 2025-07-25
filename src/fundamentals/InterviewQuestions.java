package fundamentals;

public class InterviewQuestions {

	// Write a program to swap the numbers
	public static void swapNumbers(int a, int b) {

//		int a = 100;
//		int b = 200;
//		
//		System.out.println("A="+a);
//		System.out.println("B="+b);
//		
//		a = b;
//		b = a;
//		System.out.println("A="+a);
//		System.out.println("B="+b);
//		
//		b = a;
//		a = b;
//		System.out.println("A="+a);
//		System.out.println("B="+b);
//		
//		int c = a;
//		a = b;
//		b = c;
//		
//		System.out.println("A="+a);
//		System.out.println("B="+b);

		System.out.println("Before Swaping A: " + a);
		System.out.println("Before Swaping B: " + b);

		int c = a;
		a = b;
		b = c;

		System.out.println("After Swaping A: " + a);
		System.out.println("After Swaping B: " + b);

	}

	// Write a program to swap the numbers without third variable
	public static void swapNumbersWithoutThirdVariable(int a, int b) {
		System.out.println("Before Swaping A: " + a);
		System.out.println("Before Swaping B: " + b);

		a = a + b; // 300
		b = a - b; // 300-200 = 100
		a = a - b; // 300 - 100 = 200

		System.out.println("After Swaping A: " + a);
		System.out.println("After Swaping B: " + b);

	}

	// Write a program to swap the Strings without third variable
	public static void swapStringWithoutThirdVariable(String string1, String string2) {

		System.out.println("Before Swaping String1: " + string1);
		System.out.println("Before Swaping String2: " + string2);

		string1 = string1 + string2; // HelloJava
		string2 = string1.replaceAll(string2, ""); // Hello
		string1 = string1.replaceAll(string2, ""); // Java

		System.out.println("After Swaping String1: " + string1);
		System.out.println("After Swaping String2: " + string2);

	}

	// Write a program to display duplicate characters from string
	public static void printDuplicatesFromString(String str) { // java

//		for (char eachChar : str.toCharArray()) {
//			int count = 0;
//
//			for (char eachChar2 : str.toCharArray()) {
//				if (eachChar == eachChar2) {
//					count++;
//				}
//			}
//
//			if (count > 1) {
//				System.out.println(eachChar);
//			}
//		}

//		while (str.length() > 0) {
//			char ch = str.charAt(0);
//
//			int count = 0;
//
//			for (char eachChar : str.toCharArray()) {
//				if (ch == eachChar) {
//					count++;
//				}
//			}
//
//			if (count > 1) {
//				System.out.println(ch);
//			}
//			str = str.replaceAll(String.valueOf(ch), "");
//		}

		while (str.length() > 0) {
			char ch = str.charAt(0);

			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
			str = str.replaceAll(String.valueOf(ch), "");
		}

	}

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

	// display each character count from the string: java -> j=1,1=2,v=1
	public static void printEachCharFromString(String str) { // java

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

	// Reverse String -> Java : avaJ
	public static void reverseString(String str) { // java
//		String revStr = "";		
//		for(char eachChar : str.toCharArray()) {   // avaj
//			revStr = eachChar + revStr;
//		}		
//		System.out.println(str+ " Reverse string : "+ revStr);

		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) { // avaj
			revStr = revStr + str.charAt(i);
		}
		System.out.println(str + " Reverse string : " + revStr);
	}

	// Reverse Number -> 123 : 321
	public static void reverseNumber(int number) {
//		int revNum = 0;
//		
//		while(number > 0) {
//			int remainder = number % 10;  // 3, 2, 1
//			revNum = (revNum*10) + remainder;  // 0+3 = 3, 30+2 = 32, 320+1= 321
//			number = number / 10;  // 12, 1, 0
//		}
//		
//		System.out.println(revNum);

		String revNum = "";

		for (char eachChar : String.valueOf(number).toCharArray()) { // avaj
			revNum = eachChar + revNum;
		}
		System.out.println(number + " Reverse Number : " + revNum);
	}

	public static void main(String[] args) {
//		swapVariables(100, 200);

//		swapNumbersWithoutThirdVariable(100, 200);

		swapStringWithoutThirdVariable("Hello", "Java");

		// identify duplicate characters from the string: java -> a
		printDuplicatesFromString("java");

		// identify unique characters from the string: java -> j,v
		printUniqueCharsFromString("java");

		// display each character count from the string: java -> j=1,a=2,v=1
		printEachCharFromString("java");

		// Reverse String -> Java : avaJ
		reverseString("java");

		// Reverse Number -> 123 : 321
		reverseNumber(123);
		reverseNumber(100);
		// String Palindrome -> java : avaj(not palindrome), abccba : abccba
		// Number Palindrome -> 123 : 321(not palindrome), 121 : 121
		// check number prime or not (it can divide by 1 or itself)
		// 1, 2, 3, 5, 7, 11, 13, 17, 19,

		// print all prime numbers between 1 and 100

		// check Armstrong number: 1 -> 1^3 = 1, 153 -> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 =
		// 153
		// print all Armstrong numbers between 1 and 1000

		// Reverse the each word in a sentence : "Hello Java World" -> "olleH avaJ
		// dlroW"
		// print fibonacci series : 0 1 1 2 3 5 8 13 21 34 55
		// sort the string -> java : aajv
		// sort the number -> 25341 : 12345
		// Check two string anagrams or not
		// aabbbccccddddd -> a2b3c4d5

	}

}
