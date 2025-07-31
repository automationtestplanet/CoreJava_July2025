package exceptions;

public class MultipleExceptionsWithSingleCatchBlock {

	public static void main(String[] args) {
		System.out.println("-----------------Execution Started-------------");
		int a = 100;

		String str = "JAVA";

		int[] intArr = { 10, 20, 30 };
		
		try {
			System.out.println(a / 10);
			System.out.println(str.toLowerCase());
			System.out.println(intArr[3]);
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} 

		
		System.out.println("-----------------Execution Ended-------------");

	}

}
