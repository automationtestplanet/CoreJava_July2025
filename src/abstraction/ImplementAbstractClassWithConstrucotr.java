package abstraction;

public class ImplementAbstractClassWithConstrucotr extends AbstractClassWithConstructor{

	
	public ImplementAbstractClassWithConstrucotr(String name) {
		super(name);		
	}

	public static void main(String[] args) {
		
		AbstractClassWithConstructor absClsWithCons= new ImplementAbstractClassWithConstrucotr("Hello Java");
		absClsWithCons.displayName();
	}

}
