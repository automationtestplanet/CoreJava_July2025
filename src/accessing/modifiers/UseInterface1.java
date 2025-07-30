package accessing.modifiers;

import abstraction.AccessInterface;
import abstraction.Interface1;

public class UseInterface1 {

	public static void main(String[] args) {

//		AccessInterface accinf = new AccessInterface();
//		Interface1 inf1 = accinf;
		
		Interface1 inf1 = new AccessInterface();
		
		System.out.println(inf1.addition(10, 20));
		System.out.println(inf1.subtraction(10, 20));
		
		System.out.println(Interface1.multiplication(10, 20)); 
		
		System.out.println(Interface1.NAME);
//		Interface1.NAME = "Hello"; // it is final varialbe
		
		System.out.println(inf1.division(10, 20));
	}
	
	

}
