package fundamentals;

public class FinalVariables {
	
	final static int a = 100;
	final int b = 200;
	static int g = 500;
	int h = 600;
	
	public static void addition(final int c,  final int d) {
		
		
		System.out.println(c+d);
		
//		 c= 40; // final can not be changed
//		 d = 50; // final can not be changed
		 
		final int e = 50; final int f = 60;
		System.out.println(e+f);
		
//		e = 70; // final can not be changed
//		f = 80; // final can not be changed
	}

	public static void main(String[] args) {
		System.out.println(a);
		
//		a = 200; // final can not be changed
		
		FinalVariables finalVar = new FinalVariables();
		System.out.println(finalVar.b);
//		finalVar.b =300; // final can not be changed
		
		addition(20,30);
	}

}
