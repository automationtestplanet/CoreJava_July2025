package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		System.out.println("--------------------HashMap----------------");
		Map hashMap = new HashMap();
		hashMap.put("FirstName", "Raj");
		hashMap.put("LastName", "Ch");
		hashMap.put("Qualification", "BTech");
		hashMap.put("Location", "BTech");
		hashMap.put(100, "Marks");
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.size());
		System.out.println(hashMap.get("FirstName"));
		

		System.out.println("--------------------LinkedHashMap----------------");
		Map linkedHashMap = new LinkedHashMap();
		linkedHashMap.put("FirstName", "Raj");
		linkedHashMap.put("LastName", "Ch");
		linkedHashMap.put("Qualification", "BTech");
		linkedHashMap.put("Location", "BTech");
		linkedHashMap.put(100, "Marks");
		
		System.out.println(linkedHashMap);
		
		System.out.println(linkedHashMap.size());
		System.out.println(linkedHashMap.get("FirstName"));
		

		System.out.println("--------------------TreeMap----------------");
		Map treeMap = new TreeMap();
//		treeMap.put("FirstName", "Raj");
//		treeMap.put("LastName", "Ch");
//		treeMap.put("Qualification", "BTech");
//		treeMap.put("Location", "BTech");
//		treeMap.put(100, "Marks");

		Map hashTable = new Hashtable();
	}

}
