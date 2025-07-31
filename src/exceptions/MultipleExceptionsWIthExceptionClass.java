package exceptions;

public class MultipleExceptionsWIthExceptionClass {

	public static void main(String[] args) {

		System.out.println("-----------------Execution Started-------------");
		int a = 100;

		String str = "JAVA";

		int[] intArr = { 10, 20, 30 };

		Exception ae = new ArithmeticException();
		Exception ne = new NullPointerException();
		Exception arrE = new ArrayIndexOutOfBoundsException();

		try {
			System.out.println(a / 10);
			System.out.println(str.toLowerCase());
			System.out.println(intArr[2]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----------------Execution Ended-------------");

	}

}
