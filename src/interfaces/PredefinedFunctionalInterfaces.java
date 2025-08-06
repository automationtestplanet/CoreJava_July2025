package interfaces;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {

//		Function<T, R>
//		BiFunction<T, U, R>
//		BinaryOperator<T>
//		Predicate<T>
//		Consumer<T>
//		Supplier<T>
//		Comparator<T>

		System.out.println("-----------------Function--------------");
		Function<Integer, String> fun1 = new Function<>() {
			@Override
			public String apply(Integer val) {
				return val + " Hello";
			}
		};
		System.out.println(fun1.apply(200));

		Function<Object, String> fun2 = val -> val + " Java";
		System.out.println(fun2.apply("Hello"));
		System.out.println(fun2.apply(100));

		System.out.println("-----------------BiFunction--------------");
		BiFunction<String, String, Boolean> biFun1 = new BiFunction<String, String, Boolean>() {
			@Override
			public Boolean apply(String val1, String val2) {
				return val1.equals(val2);
			}
		};
		System.out.println(biFun1.apply("Hello", "Java"));
		System.out.println(biFun1.apply("Java", "Java"));

		BiFunction<String, String, Boolean> biFun2 = (val1, val2) -> val1.equals(val2);
		System.out.println(biFun2.apply("Hello", "Java"));
		System.out.println(biFun2.apply("Java", "Java"));
		
		

		System.out.println("-----------------BinaryOperator--------------");
		BinaryOperator<String> binaryOp1 = new BinaryOperator<String>() {
			@Override
			public String apply(String val1, String val2) {
				return val1 + val2;
			}
		};
		System.out.println(binaryOp1.apply("Hello", "Java"));

		BinaryOperator<String> binaryOp2 = (val1, val2) -> val1 + val2;
		System.out.println(binaryOp2.apply("Hello", "Java"));

		BinaryOperator<Integer> binaryOp3 = (val1, val2) -> val1 + val2;
		System.out.println(binaryOp3.apply(100, 200));
		
		System.out.println("-----------------Predicate--------------");
		Predicate<String> predicate1 = new Predicate<String>() {
			@Override
			public boolean test(String val1) {
				return val1.equals("Java");
			}
		};
		System.out.println(predicate1.test("Hello"));
		System.out.println(predicate1.test("Java"));
		
		Predicate<String> predicate2 = (val1)->val1.equals("Java");
		System.out.println(predicate2.test("Hello"));
		System.out.println(predicate2.test("Java"));
		
		Predicate<Integer> predicate3 = (val1)->val1%2==0;
		System.out.println(predicate3.test(100));
		System.out.println(predicate3.test(101));
		
		System.out.println("-----------------Consumer--------------");
		Consumer<String> consumer1 = new Consumer<String>() {
			@Override
			public void accept(String val1) {				
				System.out.println(val1);
			}
		};
		
		consumer1.accept("Hello");
		
		Consumer<String> consumer2 = val1 -> System.out.println(val1);
		consumer2.accept("Hello");
		
		System.out.println("-----------------Supplier--------------");
		Supplier<String> supplier1 = new Supplier<String>() {
			@Override
			public String get() {
				return "Hello";
			}
		};
		System.out.println(supplier1.get());
		
		Supplier<String> supplier2  = () -> "Java";
		System.out.println(supplier2.get());
		
		System.out.println("-----------------Comparator--------------");

	}

}
