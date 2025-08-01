package abstraction;

public abstract class AbstractClassWithAnonymousBlock {
	
	abstract int addition(int a, int b);

	public static void main(String[] args) {
		
		AbstractClassWithAnonymousBlock absAnonymousCls = new AbstractClassWithAnonymousBlock() {
			@Override
			int addition(int a, int b) {
				return a+b;
			}			
		};
		
		
		System.out.println(absAnonymousCls.addition(10, 20));

	}

}
