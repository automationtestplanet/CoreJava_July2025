package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;

public class CursorsExample {

	public static void main(String[] args) {
//		Iterator
//		ListIterator
//		Enumeration
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(14);
		list1.add(11);
		list1.add(15);
		list1.add(13);
		list1.add(12);
		
		Iterator<Integer> itr = list1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		
		
		
		Set hashSet = new HashSet();
		hashSet.add(true);
		hashSet.add(100);
		hashSet.add(100.5);
		hashSet.add('A');
		hashSet.add("Java");
		hashSet.add(new SetExample());
		hashSet.add(100);
		
		Iterator itr2 = hashSet.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next()); 
		}
		
		ListIterator<Integer> listItr =list1.listIterator();
		
		if(listItr.hasNext()) {			
			System.out.println(listItr.next());
			System.out.println(listItr.next());
			System.out.println(listItr.next());
		}
		
		if(listItr.hasPrevious()) {			
			System.out.println(listItr.previous());
			System.out.println(listItr.previous());
			System.out.println(listItr.previous());
		}
		
		
	}

}
