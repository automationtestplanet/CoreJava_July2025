package abstraction;

abstract public class AbstractClass {

	/**
	 * Description: This method performs addition operation on two integer variables
	 * and returns result in the form of integer
	 * 
	 * @author Naresh Kumar *
	 * @param a
	 * @param b
	 * @return int
	 */
	abstract public int addition(int a, int b); // Abstract method

	public int subtraction(int a, int b) { // Concrete method
		return a - b;
	}
	
	public static void main(String[] args) {
//		AbstractClassExample absCls = new AbstractClassExample();  // can not create object of abstract class
	}

}
