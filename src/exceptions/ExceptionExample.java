package exceptions;


public class ExceptionExample {

	public static void main(String[] args) throws InterruptedException{

		System.out.println("-----------------Execution Started-------------");

//		int 100 = c; // compiler checking syntax errors

		int c = 100;

		int a = 100;
		int b = 0;
		
		

		try {
			System.out.println(a / b);     // runtime exception
		} catch (ArithmeticException ae) {
			System.out.println("Unable to divide "+a+" with "+b);
//			System.out.println(a/1);
		}
		
//		try {
//			Thread.sleep(10000);				// compile-tIme Exception
//		}catch( InterruptedException ie) {
//			
//		}
		
		Thread.sleep(10000);

		System.out.println("-----------------Execution Ended-------------");

	}

}
