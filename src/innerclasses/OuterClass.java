package innerclasses;

public class OuterClass {

	static class StaticInnerClass {
		public static void method1() {
			System.out.println("This is Static inner class method1");
		}

		public void method3() {
			System.out.println("This is Static inner class method3");
		}
	}

	static { // static block
		System.out.println("This is Static Block");
	}

	class InstanceInnerClass {
		public void method2() {
			System.out.println("This is Instnace inner class method2");
		}

		public void method4() {
			System.out.println("This is Instnace inner class method4");
		}
	}

	{ // Instance Inner class without name / Anonymous class
		System.out.println("This is Anonymous class Block");
	}

	public static void main(String[] args) {
		OuterClass outCls = new OuterClass();

		OuterClass.StaticInnerClass.method1();
		outCls.new InstanceInnerClass().method2();

		OuterClass.StaticInnerClass statInnerCls = new StaticInnerClass();
		OuterClass.StaticInnerClass.method1();
		statInnerCls.method3();

		OuterClass.InstanceInnerClass insInnerCls = outCls.new InstanceInnerClass();
		insInnerCls.method2();
		insInnerCls.method4();
	}

}
