package exceptions;

public class TryWithMultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("-----------------Execution Started-------------");
		int a = 100;

		String str = "JAVA";

		int[] intArr = { 10, 20, 30 };
		
		try {
			System.out.println(a / 10);
			System.out.println(str.toLowerCase());
			System.out.println(intArr[2]);
		} catch (ArithmeticException ae) {
			System.out.println("Divisible by Zero not possible");
		} catch (NullPointerException ne) {
			System.out.println("String value is null");
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("index is not found");
		}
		
		System.out.println("-----------------Execution Ended-------------");

	}

}
