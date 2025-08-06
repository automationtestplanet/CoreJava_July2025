package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
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
		
		arrayList.add(2,"Java");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.contains(100));
		System.out.println(arrayList.isEmpty());
		arrayList.clear();
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());
		

		List list2 = new ArrayList();
		list2.add(14);
		list2.add(11);
		list2.add(15);
		list2.add(13);
		list2.add(12);
		
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		
		for(Object eachObj: list2) {
			System.out.println(eachObj);
		}
		

	}

}
