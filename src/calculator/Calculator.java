package calculator;

public interface Calculator {

	/**
	 * Description: This method performs addition operation on two integer variables
	 * and returns sum of values as integer
	 * 
	 * @author Naresh Kumar
	 * @param a
	 * @param b
	 * @return int
	 */
	int addition(int a, int b);

	/**
	 * Description: This method performs subtraction operation on two integer
	 * variables and returns the integer
	 * 
	 * @author Naresh Kumar
	 * @param a
	 * @param b
	 * @return int
	 */
	int subtraction(int a, int b);

	/**
	 * Description: This method performs multiplication operation on two integer
	 * variables and returns the integer
	 * 
	 * @author Naresh Kumar
	 * @param a
	 * @param b
	 * @return int
	 */
	int multiplication(int a, int b);

	/**
	 * Description: This method performs division operation on two integer variables
	 * and returns the integer
	 * 
	 * @author Naresh Kumar
	 * @param a
	 * @param b
	 * @return int
	 */
	int division(int a, int b);

	/**
	 * Description: This method performs modular division operation on two integer
	 * variables and returns the integer
	 * 
	 * @author Naresh Kumar
	 * @param a
	 * @param b
	 * @return int
	 */
	int modDivision(int a, int b);

}
