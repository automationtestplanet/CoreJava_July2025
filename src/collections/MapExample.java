package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
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
		hashMap.put(null, "Hyderabad");
		hashMap.put("Height", null);
		hashMap.put("Color", null);
		hashMap.put("Caste", null);
		
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
		linkedHashMap.put(null, "Hyderabad");
		linkedHashMap.put("Height", null);
		linkedHashMap.put("Color", null);
		linkedHashMap.put("Caste", null);
		
		System.out.println(linkedHashMap);
		
		System.out.println(linkedHashMap.size());
		System.out.println(linkedHashMap.get("FirstName"));
		

		System.out.println("--------------------TreeMap----------------");
		Map treeMap = new TreeMap();
		treeMap.put("FirstName", "Raj");
		treeMap.put("LastName", "Ch");
		treeMap.put("Qualification", "BTech");
		treeMap.put("Location", "BTech");
//		treeMap.put(null, "Hyderabad");
		treeMap.put("Height", null);
		treeMap.put("Color", null);
		treeMap.put("Caste", null);
		
		System.out.println(treeMap);

		System.out.println("--------------------HashTable----------------");		
		Map hashTable = new Hashtable();
		hashTable.put("FirstName", "Raj");
		hashTable.put("LastName", "Ch");
		hashTable.put("Qualification", "BTech");
		hashTable.put("Location", "BTech");
		hashTable.put(100, "Marks");
//		hashTable.put(null, "Hyderabad");
//		hashTable.put("Height", null);
		
		System.out.println(hashTable);
		
		Set set1 = hashTable.entrySet();
		for(Object eachObj:set1) {
			System.out.println(eachObj);
		}
	}

}
