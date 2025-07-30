package polymorphism;

public class NewCalculator extends Calculator {

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
		NewCalculator newCalc = new NewCalculator();
		System.out.println(newCalc.addition(10, 20));
		System.out.println(newCalc.addition(10.5F, 20.5F));
		System.out.println(newCalc.addition(10, 20, 30));
		System.out.println(newCalc.addition("Hello", "Java"));
		System.out.println(newCalc.addition(10, 20, 30, 40));
		System.out.println(NewCalculator.multiplication(10,20));
		System.out.println(Calculator.multiplication(10,20));
		
		System.out.println(newCalc.division(10, 3));

	}
}
