package fundamentals;

public class GlobalVariables {

	static int a = 100;
	static int b = 200;
	static int c = 300;
	static int d = 400;
	static int e = 500;
	static int f = 600;
	
	int g = 900;
	int h = 1000;

	public static void addition() {
		System.out.println("Additoion of " + a + "+" + b + ": " + (a + b));
	}

	public static void multiplication(int e, int f) { // local variables
		System.out.println("Multiplication of " + e + " * " + f + ": " + (e * f));
	}

	public static void subtraction() {
		System.out.println("Additoion of " + a + "+" + b + ": " + (a + b));

		System.out.println("Subtraction of " + c + "-" + d + ":" + (c - d));

		System.out.println("Multiplication of " + e + "*" + f + ": " + (e * f));
	}
	
	public static void division() {
		
		GlobalVariables globalVariables = new GlobalVariables();
		System.out.println("Division of " + globalVariables.g + "*" + globalVariables.h + ": " + (globalVariables.g / globalVariables.h));
	}
	
	public void modDivision() {
		System.out.println("Division of " + g + "*" + h + ": " + (g % h));
	}

	
	public void sum() {
		System.out.println("Sum of " + a + "+" + b + ": " + (a + b));
	}
	
	
	public static void main(String[] args) {
		addition();
		multiplication(700, 800);
		subtraction();
		
		division();
		
		GlobalVariables globalVariables = new GlobalVariables();
		
		globalVariables.modDivision();
		
		globalVariables.sum();
	}

}
