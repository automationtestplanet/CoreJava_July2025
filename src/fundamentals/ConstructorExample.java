package fundamentals;

public class ConstructorExample {

	int a;
	int b;

	public ConstructorExample() {
		
	}
	
	
	public ConstructorExample(int a, int b) {
		this.a = a;
		this.b = b;
	}


	public static void addition() {
		int c;
		int d;
//		System.out.println(c + d); // before using the local variable, we must initialize the value
	}

	public static void subtraction(int e, int f) {
		System.out.println(e - f);
	}

	public void multiplication() {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
//		subtraction(); //we must initialize the parameters with arguments
		subtraction(100, 20);

		ConstructorExample consEx = new ConstructorExample();
		
		consEx.multiplication();
		
		ConstructorExample consEx2 = new ConstructorExample(5,5);
		
		consEx2.multiplication();
		
		consEx.multiplication();
		
		System.out.println(consEx.a);
		System.out.println(consEx.b);
		
		System.out.println(consEx2.a);
		System.out.println(consEx2.b);

	}

}
