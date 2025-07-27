package interview.questions;

public class SwapNumbers {

	// Write a program to swap the numbers
	public static void swapNumbers(int a, int b) {

//			int a = 100;
//			int b = 200;
//			
//			System.out.println("A="+a);
//			System.out.println("B="+b);
//			
//			a = b;
//			b = a;
//			System.out.println("A="+a);
//			System.out.println("B="+b);
//			
//			b = a;
//			a = b;
//			System.out.println("A="+a);
//			System.out.println("B="+b);
//			
//			int c = a;
//			a = b;
//			b = c;
//			
//			System.out.println("A="+a);
//			System.out.println("B="+b);

		System.out.println("Before Swaping A: " + a);
		System.out.println("Before Swaping B: " + b);

		int c = a;
		a = b;
		b = c;

		System.out.println("After Swaping A: " + a);
		System.out.println("After Swaping B: " + b);

	}

	public static void main(String[] args) {
		swapNumbers(100, 200);
	}
}
