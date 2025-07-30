package accessing.modifiers;

import abstraction.AbstractClass;
import abstraction.AccessAbstractClass;

public class UseArithematicOperations {

	public static void main(String[] args) {
		
//		ImplementsAbstractClass impCls = new ImplementsAbstractClass();  // it is not public class
		
		AccessAbstractClass accAbsCls = new AccessAbstractClass();
		
		
		AbstractClass absCls = accAbsCls;
		
		System.out.println(absCls.addition(10, 20));
		
		

	}

}
