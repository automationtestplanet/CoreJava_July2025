package abstraction;

public interface Interface1 {
	
	String NAME = "Java";  // by default it is public static final

//	int addition(int a, int b) {
//		
//	}

	/**
	 * Description: This method performs addition operation on two integer variables
	 * and returns result in the form of integer
	 * 
	 * @author Naresh Kumar *
	 * @param a
	 * @param b
	 * @return int
	 */
	abstract int addition(int a, int b);

	/**
	 * Description: This method performs subtraction operation on two integer
	 * variables and returns result in the form of integer
	 * 
	 * @author Naresh Kumar *
	 * @param a
	 * @param b
	 * @return int
	 */
	int subtraction(int a, int b);
	
	static int multiplication(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		
	}
	
	default public int division(int a, int b) {
		return a/b;
	}

}
