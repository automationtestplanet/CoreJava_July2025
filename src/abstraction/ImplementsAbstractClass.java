package abstraction;

class ImplementsAbstractClass extends AbstractClass {

	@Override
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int multiplication(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		ImplementsAbstractClass accAbsCls = new ImplementsAbstractClass();

	}

	

}
