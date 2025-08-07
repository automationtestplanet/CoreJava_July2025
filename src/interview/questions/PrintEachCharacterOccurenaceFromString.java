package interview.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintEachCharacterOccurenaceFromString {

	// display each character count from the string: java -> j=1,1=2,v=1
	public static void printEachCharOccurenaceFromString(String str) { // java
		while (str.length() > 0) {
			char ch = str.charAt(0);
			int count = 0;
			for (char eachChar : str.toCharArray()) {
				if (ch == eachChar) {
					count++;
				}
			}
			System.out.println(ch + " : " + count);
			str = str.replaceAll(String.valueOf(ch), "");
		}
	}

	// display each character count from the string: java -> j=1,1=2,v=1
	public static void printEachCharOccurenaceFromStringUsingCollections(String str) { // java
		Map<Character, Integer> charsMap = new LinkedHashMap<>();
		for (char eachChar : str.toCharArray()) {
			if (charsMap.containsKey(eachChar)) {
				charsMap.put(eachChar, charsMap.get(eachChar) + 1);
			} else {
				charsMap.put(eachChar, 1);
			}
		}
		System.out.println(charsMap);
	}

	// display each character count from the string: java -> j=1,1=2,v=1
	public static void printEachCharOccurenaceFromStringUsingStreams(String str) { // java
		Map<Character, Long> charsMap = str.chars().mapToObj(eachCharInt -> (char) eachCharInt)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(charsMap);
	}

	public static void main(String[] args) {
		// display each character count from the string: java -> j=1,a=2,v=1
		printEachCharOccurenaceFromString("java");
		printEachCharOccurenaceFromStringUsingCollections("java");
		printEachCharOccurenaceFromStringUsingStreams("java");
	}

}
