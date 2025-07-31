package exceptions;

public class ExceptionExample2 {

	public void division(int a, int b) {

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("Divisible by Zero not possible");
//			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
	}

	public static void main(String[] args) {
		ExceptionExample2 ee = new ExceptionExample2();

		ee.division(100, 0);
	}

}
