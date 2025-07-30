package access.modifers;

public class ArithematicOperations {

	public int a = 1000;

	protected String str = "Java";

	private char ch = '$';

	boolean bool1 = true;

	public int addition(int a, int b) {
		return a + b;
	}

	protected int subtraction(int a, int b) {
		return a - b;
	}

	private int multiplication(int a, int b) {
		return a * b;
	}

	int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		ArithematicOperations arOp = new ArithematicOperations();
		System.out.println(arOp.a); // public
		System.out.println(arOp.str); // protected
		System.out.println(arOp.ch);  // private
		System.out.println(arOp.bool1); // default
		
		System.out.println(arOp.addition(10, 20));  // public
		System.out.println(arOp.subtraction(10, 20)); // protected
		System.out.println(arOp.multiplication(10, 20)); // private
		System.out.println(arOp.division(10, 20)); // default

	}
	
	private class Class1{
		
	}
	
	protected interface Interface1{
		
	}
	
	enum Enum1{
		
	}

}
