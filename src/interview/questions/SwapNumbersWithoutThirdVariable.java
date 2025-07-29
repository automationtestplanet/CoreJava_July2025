package interview.questions;

public class SwapNumbersWithoutThirdVariable {

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

	public static void main(String[] args) {
		swapNumbersWithoutThirdVariable(100, 200);

	}

}
