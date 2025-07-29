package inheritance;

public class AccessArithematicOperations extends ArithematicOperations {
	
	public int modDivison(int a, int b) {
		return a%b;
	}

	public static void main(String[] args) {
		
		AccessArithematicOperations accArOp = new AccessArithematicOperations();
		System.out.println(accArOp.modDivison(10,3));
		
		System.out.println(accArOp.a);  // public 
		System.out.println(accArOp.str); // protected
//		System.out.println(accArOp.ch);  // private can not be accessed
		System.out.println(accArOp.bool1);  // default
		
		System.out.println(accArOp.addition(10, 20)); // public 
		System.out.println(accArOp.subtraction(10, 20)); // protected
//		System.out.println(accArOp.multiplication(10, 20)); // private can not be accessed
		System.out.println(accArOp.division(10, 20));  //default
		
		

	}

}
