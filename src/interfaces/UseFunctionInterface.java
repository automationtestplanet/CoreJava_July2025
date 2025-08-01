package interfaces;

public class UseFunctionInterface {
	
	public static void main(String[] args) {
		FunctionInterfaceExample funInf = new FunctionInterfaceExample() {
			@Override
			public int addition(int a, int b) {
				return a+b;
			}			
		};
		
		System.out.println(funInf.addition(10, 20));
		
		
		FunctionInterfaceExample funInf2 = (a,b) -> {return a+b;};   // lambda expression
		System.out.println(funInf2.addition(100, 200));
	}

}
