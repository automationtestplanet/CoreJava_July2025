package abstraction;

abstract public class AbstractClassWithConstructor {

	String name;

	public AbstractClassWithConstructor(String name) {
		this.name = name;
	}

	public void displayName() {
		System.out.println("Name: " + this.name);
	}

	public static void main(String[] args) {
//		AbstractClassWithConstructor absCls = new AbstractClassWithConstructor("Hello Java");
	}

}
