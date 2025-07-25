package fundamentals;

public class LocalVariables {
	
	public static void addition() {
		int a = 100; int b = 200;	// Local variables
		System.out.println(a+b);
	}
	
	public static void multiplication(int e, int f) {	 // local variables
		System.out.println(e*f);
	}
	
	public static void subtraction() {	
//		System.out.println(a+b);  // local variables we can not access in another method
//		
//		System.out.println(c+d);  // local variables we can not access in another method
//		
//		System.out.println(e*f);  // local variables we can not access in another method
	}


	public static void main(String[] args) {
		int c = 300; int d = 400; // Local variables
		addition();

	}

}
