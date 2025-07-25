package fundamentals;

public class AccessStaticAndInstance {

	static int a = 100;
	int b = 200;
	
	static void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	void subtraction(int b) {
		System.out.println(this.b-b);
		this.multiplication();
	}
	
	void multiplication() {
		System.out.println(AccessStaticAndInstance.a*this.b);
	}
	
	public static void main(String[] args) {
		System.out.println(AccessStaticAndInstance.a);
		AccessStaticAndInstance.addition(100, 200);
		
		AccessStaticAndInstance acc = new AccessStaticAndInstance();
//		this.subtraction(); // this we can not use in static methods.
		
		acc.subtraction(100);
		
	}
	
}
