package polymorphism;

public class OverridingExample extends OverloadingExample {

	int addition(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	@Override
	int addition(int a, int b) {
		return a + b + 5;
	}
	
//	@Override // static method can not be override
	static int multiplication(int a, int b) {
		return a*b+100;
	}
	
//	@Override
//	final int division(int a, int b) {  // final method can not be override
//		return a/b;
//	}

	public static void main(String[] args) {
		OverridingExample newCalc = new OverridingExample();
		System.out.println(newCalc.addition(10, 20));
		System.out.println(newCalc.addition(10.5F, 20.5F));
		System.out.println(newCalc.addition(10, 20, 30));
		System.out.println(newCalc.addition("Hello", "Java"));
		System.out.println(newCalc.addition(10, 20, 30, 40));
		System.out.println(OverridingExample.multiplication(10,20));
		System.out.println(OverloadingExample.multiplication(10,20));
		
		System.out.println(newCalc.division(10, 3));

	}
}
