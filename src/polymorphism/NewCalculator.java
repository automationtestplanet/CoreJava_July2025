package polymorphism;

public class NewCalculator extends Calculator {

	@Override
	int addition(int a, int b) {
//		return this.addition(a ,b) + 100;   // this keyword for current class
		return super.addition(a, b) + 100; // super keyword for parent class
	}

	int modDivision(int a, int b) {
		return a % b;
	}
}
