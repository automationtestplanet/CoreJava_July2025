package accessing.modifiers;

import access.modifers.ArithematicOperations;

public class AccessArithematicOperations {

	public static void main(String[] args) {
		ArithematicOperations arOp = new ArithematicOperations();
		System.out.println(arOp.a);
//		System.out.println(arOp.str);  // protected access
//		System.out.println(arOp.ch);  // private access
//		System.out.println(arOp.bool1); // default access
		
		System.out.println(arOp.addition(10, 20));
//		System.out.println(arOp.subtraction(10, 20)); // protected access
//		System.out.println(arOp.multiplication(10, 20)); // private access
//		System.out.println(arOp.division(10, 20)); // default access

	}

}
