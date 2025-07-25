package fundamentals;

public class MethodExample {

	public static void addition() {
		int a = 1000;
		int b = 2000;
		System.out.println("Addition: " + (a + b));
	}

	public static void subtraction() {
		int a = 100;
		int b = 200;
		System.out.println("Subtraction: " + (a - 5));
	}

	public static void multiplication() {
		int a = 100;
		int b = 200;
		System.out.println("Multiplication: " + a * 5);
	}

	public static void division() {
		int a = 100;
		int b = 200;
		System.out.println("Division: " + a / 5);
	}

	public static void modDivision() {
		int a = 100;
		int b = 200;
		System.out.println("Modular Division: " + a % 5);
	}

	public static void main(String[] args) {
		division();

	}

	
}
