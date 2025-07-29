package interview.questions;

public class PrintFibonacciSeries {

	// print fibonacci series : 0 1 1 2 3 5 8 13 21 34 55
	public static void printFibonacciSeries() {
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		for (int i = 0; i < 10; i++) {
			System.out.print(b + " ");
			int c = a;
			a = b;
			b = a + c;
		}
	}

	public static void main(String[] args) {
		printFibonacciSeries();
	}

}
