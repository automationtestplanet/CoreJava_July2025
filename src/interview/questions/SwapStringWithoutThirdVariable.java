package interview.questions;

public class SwapStringWithoutThirdVariable {

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

	public static void main(String[] args) {
		swapStringWithoutThirdVariable("Hello", "Java");
	}

}
