package interfaces;

public class ArithematicOperations {

	int subtraction(int a, int b) {
		return a - b;
	}

	void division(int a, int b) {
		System.out.println(a / b);
	}

	static int modDivision(int a, int b) {
		return a % b;
	}

	static void addition(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		FunctionalInterface4 inf4 = ArithematicOperations::modDivision;
		System.out.println(inf4.sum(10, 3));

		FunctionalInterface5 fun5 = ArithematicOperations::addition;
		fun5.multiplication(10, 20);

		ArithematicOperations arOp = new ArithematicOperations();

		FunctionalInterface4 inf4_4 = arOp::subtraction;
		System.out.println(inf4_4.sum(10, 3));

		FunctionalInterface5 fun5_5 = arOp::division;
		fun5_5.multiplication(10, 20);

	}

}
