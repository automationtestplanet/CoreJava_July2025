package polymorphism;

public class OverloadingExample {

	int addition(int a, int b) {
		return a + b;
	}

//	int addition(int a, int b) {
//		return a + b;
//	}

	float addition(float a, float b) {
		return a + b;
	}

	int addition(int a, int b, int c) {
		return a + b + c;
	}

	String addition(String a, String b) {
		return a + b;
	}

	static int multiplication(int a, int b) {
		return a * b;
	}

	final int division(int a, int b) {
		return a / b;
	}

//	int addition(int a, int b, int c, int d, int e) {
//		return a + b + c + d + e;
//	}
//
//	int addition(int a, int b, int c, int d, int e, int f) {
//		return a + b + c + d + e + f;
//	}
	
	int addition(int ...a) {  // varargs
		int sum = 0;
		
		for(int eachVal:a) {
			sum = sum +eachVal;
		}
		return sum;
	}

	public static void main(String[] args) {
		OverloadingExample calc = new OverloadingExample();
		System.out.println(calc.addition(10, 20));
		System.out.println(calc.addition(10.5F, 20.5F));
		System.out.println(calc.addition(10, 20, 30));
		System.out.println(calc.addition("Hello", "Java"));
		
		System.out.println(calc.addition(10));
		System.out.println(calc.addition(10,20));
		System.out.println(calc.addition(10,20,30));
		System.out.println(calc.addition(10,20,30,40));
		System.out.println(calc.addition(10,20,30,40,50));
		System.out.println(calc.addition(10,20,30,40,50,60));
		System.out.println(calc.addition(10,20,30,40,50,60,70));
		System.out.println(calc.addition(10,20,30,40,50,60,70,80));
		System.out.println(calc.addition(10,20,30,40,50,60,70,80,90));
		System.out.println(calc.addition(10,20,30,40,50,60,70,80,90,100));
	}
}
