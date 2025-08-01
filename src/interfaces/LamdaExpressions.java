package interfaces;

public class LamdaExpressions {

	public static void main(String[] args) {

		FunctionalInterface1 fun1 = () -> {
			System.out.println("Hello Java");
		};
		fun1.print();
		FunctionalInterface1 fun1_1 = () -> System.out.println("Hello World");
		fun1_1.print();

		FunctionalInterface2 fun2 = (val) -> System.out.println(val);
		fun2.displayValue("Java");
		FunctionalInterface2 fun2_2 = val -> System.out.println(val);
		fun2_2.displayValue("Java");

		FunctionalInterface3 fun3 = val -> {
			return val * 30;
		};
		System.out.println(fun3.getValue(10));
		FunctionalInterface3 fun3_3 = val -> val * 30;
		System.out.println(fun3_3.getValue(20));

		FunctionalInterface4 fun4 = (val1, val2) -> val1 + val2;
		System.out.println(fun4.sum(1000, 2000));

		FunctionalInterface5 fun5 = (val1, val2) -> System.out.println(val1 * val2);
		fun5.multiplication(10, 20);
	}

}
