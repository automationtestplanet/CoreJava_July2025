package fundamentals;

public class TypesOfMethods {

	public static void addition() {
		int a = 1000;
		int b = 2000;
		System.out.println("Addition: " + (a + b));
	}

	public static void subtraction(int a, int b) { // parameters
		System.out.println("Subtraction of " + a + "-" + b + " : " + (a - b));
	}

	public static int multiplication() {
		int a = 100;
		int b = 200;
		return a * 5; // return result
	}

	public static int division(int a, int b) { // parameters
		return a / b; // return result
	}

	public static int modDivision(int a, int b) { // parameters
//		int a = 100;
//		int b = 200;

//		int c = 300;
//		int c = 300;

		return a / b; // return result
	}
	
//	public static short sum(int a, int b) {  // 10,20
//		return a+b;
//	}
	
//	public static short sum(short a, short b) {  // 10,20
//		return a+b;
//	}
	
//	public static short sum(byte a, byte b) {  // 10,20
//		return a+b;
//	}


	public static void main(String[] args) {
		addition();

		subtraction(100, 30); // arguments
		subtraction(10, 2);

		int result = multiplication();
		System.out.println(result);
		System.out.println(result * 5);

		System.out.println(multiplication());
		System.out.println(multiplication() * 10);

		subtraction(result, 270);
		subtraction(multiplication(), 270);

		System.out.println(division(100, 5));
		System.out.println(division(10, 3));

		subtraction(multiplication(), division(100, 5));
		
		int result2 = division(100,3);  //33
		
		System.out.println(result2);

	}

}
