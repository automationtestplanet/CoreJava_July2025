package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {

	public static void main(String[] args) {
		System.out.println("----------------ArrayList-------------");
		List arrayList = new ArrayList();
		arrayList.add(true);
		arrayList.add(100);
		arrayList.add(100.5);
		arrayList.add('A');
		arrayList.add("Java");
		arrayList.add(new ListExample());
		arrayList.add(100);

		System.out.println(arrayList);

		System.out.println(arrayList.size());
		System.out.println(arrayList.remove("Java"));

		System.out.println(arrayList);

		System.out.println(arrayList.get(2));

		System.out.println("----------------LinkedList-------------");
		List linkedList = new LinkedList();
		linkedList.add(true);
		linkedList.add(100);
		linkedList.add(100.5);
		linkedList.add('A');
		linkedList.add("Java");
		linkedList.add(new ListExample());
		linkedList.add(100);

		System.out.println(linkedList);

		System.out.println(linkedList.size());
		System.out.println(linkedList.remove("Java"));

		System.out.println(linkedList);

		System.out.println(linkedList.get(2));

	}

}
