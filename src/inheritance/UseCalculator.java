package inheritance;

public class UseCalculator {

	public static void main(String[] args) {

		NewCalculator2 newCalc = new NewCalculator2();

		System.out.println(newCalc.addition(101846, 2029479));
		System.out.println(newCalc.subtraction(101846, 2029479));
		System.out.println(newCalc.multiplication(10, 20));
		System.out.println(newCalc.multiplication(100, 3));
		System.out.println(newCalc.modDivision(10, 3));
	}

}
