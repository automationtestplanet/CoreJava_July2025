package abstraction;

public interface InterfaceWithAnonymousClass {
	
	int addition(int a, int b);
	int subtraction(int a, int b);
	
	public static void main(String[] args) {
		InterfaceWithAnonymousClass infAnonymousCls = new InterfaceWithAnonymousClass() {
			@Override
			public int addition(int a, int b) {
				return a+b;
			}
			
			@Override
			public int subtraction(int a, int b) {
				return a-b;
			}			
		};
		
		System.out.println(infAnonymousCls.addition(100, 200));
		System.out.println(infAnonymousCls.subtraction(100, 200));
	}
}
