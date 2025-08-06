package collections;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		System.out.println("-------------HashSet-----------------");
		Set hashSet = new HashSet();
		hashSet.add(true);
		hashSet.add(100);
		hashSet.add(100.5);
		hashSet.add('A');
		hashSet.add("Java");
		hashSet.add(new SetExample());
		hashSet.add(100);
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.remove("Java"));

		System.out.println(hashSet);

//		System.out.println(hashSet.get(2)); // we don't have any get method
		
		System.out.println("-------------LinkedHashSet-----------------");
		Set linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(true);
		linkedHashSet.add(100);
		linkedHashSet.add(100.5);
		linkedHashSet.add('A');
		linkedHashSet.add("Java");
		linkedHashSet.add(new SetExample());
		linkedHashSet.add(100);
		
		System.out.println(linkedHashSet);
		System.out.println(linkedHashSet.size());
		System.out.println(linkedHashSet.remove("Java"));

		System.out.println(linkedHashSet);
		
//		
		System.out.println("-------------TreeSet-----------------");
		Set treeSet = new TreeSet();
//		Set treeSet = new TreeSet(Collections.reverseOrder());
//		treeSet.add(true);
//		treeSet.add(100);
//		treeSet.add(100.5);
//		treeSet.add('A');
//		treeSet.add("Java");
		
//		treeSet.add(4);
//		treeSet.add(2);
//		treeSet.add(5);
//		treeSet.add(1);
//		treeSet.add(3);
		
//		treeSet.add('D');
//		treeSet.add('B');
//		treeSet.add('E');
//		treeSet.add('A');
//		treeSet.add('C');
		
		treeSet.add("Banana");
		treeSet.add("Carrot");
		treeSet.add("Apple");
		treeSet.add("Cherry");
		treeSet.add("Berry");
		System.out.println(treeSet);
		
		for(Object eachObj: treeSet) {
			System.out.println(eachObj);
		}
		
		
	}
}
