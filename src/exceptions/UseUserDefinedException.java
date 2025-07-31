package exceptions;

public class UseUserDefinedException {

	
	public static void printNumber(int number) throws UserDefeinedException {
		
	
		if(number > 100) {
			System.out.println(number);
		}else {
			throw new UserDefeinedException("Number is less than 100");
		}
		
	}
	
	public static void main(String[] args) throws UserDefeinedException{
		printNumber(101);
		printNumber(100);
		
		System.out.println("Execution completed");


	}

}
