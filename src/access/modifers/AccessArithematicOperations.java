package access.modifers;

public class AccessArithematicOperations {

	public static void main(String[] args) {
		ArithematicOperations arOp = new ArithematicOperations();
		System.out.println(arOp.a);  // public 
		System.out.println(arOp.str); // protected
//		System.out.println(arOp.ch);  // private can not be accessed
		System.out.println(arOp.bool1);  // default
		
		System.out.println(arOp.addition(10, 20)); // public 
		System.out.println(arOp.subtraction(10, 20)); // protected
//		System.out.println(arOp.multiplication(10, 20)); // private can not be accessed
		System.out.println(arOp.division(10, 20));  //default

	}

}
