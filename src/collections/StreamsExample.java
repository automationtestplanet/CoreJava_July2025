package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(14);
		list1.add(11);
		list1.add(15);
		list1.add(13);
		list1.add(12);
		
//		for (Integer eachNum : list1) {
//			System.out.println(eachNum);
//		}
		
		System.out.println("-----------------Using ForEach loop and Consumer--------------");
//		Consumer<String> consumer2 = val1 -> System.out.println(val1);
		list1.forEach(eachVal -> System.out.println(eachVal));
		System.out.println("-----------------Using ForEach loop and Consumer as method Reference--------------");
		list1.forEach(System.out::println);
		
		System.out.println("-----------------Print Even Numbers using Enhanced For loop--------------");
		for (Integer eachNum : list1) {
			if(eachNum%2==0)
				System.out.println(eachNum);
		}
		
		System.out.println("-----------------Print Even Numbers using Stream Filter--------------");
//		Predicate<Integer> predicate3 = (val1)->val1%2==0;
		list1.stream().filter(val1->val1%2==0).forEach(System.out::println);
		
		System.out.println("-----------------Print Odd Numbers using Stream Filter--------------");
		list1.stream().filter(val1->val1%2!=0).forEach(System.out::println);
		
		List<Integer> filteredList =  list1.stream().filter(val1->val1%2!=0).collect(Collectors.toList());
		System.out.println(filteredList);
		
		System.out.println("-----------------Multiply eachValue with 5 in a list using Stream Map--------------");
//		Function<Object, String> fun2 = val -> val + " Java";
		list1.stream().map(val -> val*5).forEach(System.out::println);
		List<Integer> mappedList =  list1.stream().map(val -> val*5).collect(Collectors.toList());
		System.out.println(mappedList);
		
		System.out.println("-----------------Get the summ of all values in a list using Stream Reduce--------------");
//		BinaryOperator<Integer> binaryOp3 = (val1, val2) -> val1 + val2;
		int sum = list1.stream().reduce(0, (val1, val2) -> val1 + val2);
		System.out.println(sum);

	}

}
