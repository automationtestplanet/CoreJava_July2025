package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericCollectionsExample {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(14);
		list1.add(11);
		list1.add(15);
		list1.add(13);
		list1.add(12);
//		list1.add("Java");

		System.out.println(list1.get(0));

		int firstVal = (int) list1.get(0);
		System.out.println(firstVal);

		int lastVal = (int) list1.get(list1.size() - 1);
		System.out.println(lastVal);

		Set<String> set1 = new HashSet<>();
		set1.add("Apple");
		set1.add("Banana");
		set1.add("Cherry");
//		set1.add(10);
//		set1.add('C');

		for (String eachStr : set1) {
			System.out.println(eachStr);
		}

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Maths", 99);
		map1.put("Science", 99);
		map1.put("Social", 99);
		map1.put("English", 99);
		map1.put("Telugu", 99);
//		map1.put("Hindhi", "Fail");

		Map<String, Object> map2 = new HashMap<>();
		map2.put("Maths", 99);
		map2.put("Science", 99);
		map2.put("Social", 99);
		map2.put("English", 99);
		map2.put("Telugu", 99);
		map2.put("Hindhi", "Fail");

		Map<Object, Integer> map3 = new HashMap<>();
		map3.put("Maths", 99);
		map3.put("Science", 99);
		map3.put("Social", 99);
		map3.put("English", 99);
		map3.put("Telugu", 99);
		map3.put(100, 100);

		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student("Ram", 1001, "10th"));
		studentSet.add(new Student("Venkat", 1002, "10th"));
		studentSet.add(new Student("Krish", 1003, "10th"));

		Set<Map.Entry<String, Integer>> entriesSet = map1.entrySet();

		for (Map.Entry<String, Integer> eachEntry : entriesSet) {
			System.out.println(eachEntry);
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}

	}

}
