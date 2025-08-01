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
		Function<Integer,Integer> fun1 = new Function<>() {
			@Override
			public Integer apply(Integer t) {
				return t;
			}
		};
	}

}
