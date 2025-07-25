package fundamentals;

public class StringMethods {

	public static void main(String[] args) {

		String string1 = "Hello";
		
		System.out.println(string1);

		System.out.println(string1.length());

		System.out.println(string1.toUpperCase());
		
		System.out.println(string1);
		
		String string2 = string1.toUpperCase();
		System.out.println(string2);
		
		string1 = string1.toUpperCase();
		System.out.println(string1);
		
		String string3 = "Java";
		String string4 = "Java";
		
		System.out.println(string3.toLowerCase());
		
		string3 = string3.toLowerCase();
		
		System.out.println(string4+" Programming"); 
		System.out.println(string4.concat(" Programming")); 
		System.out.println(string4.charAt(0));
		System.out.println(string4.charAt(string4.length()-1));
		System.out.println(string4.charAt(2));
		
		
		System.out.println(string4.indexOf('J'));
		System.out.println(string4.indexOf('a'));
		System.out.println(string4.lastIndexOf('a'));
		
		
		char[] charArr = string4.toCharArray();
		for(char eachChar : charArr) {
			System.out.println(eachChar);
		}
		
		String string5 = "Hello Java World";
		
		System.out.println( string5.contains("Hello"));
		System.out.println( string5.contains("Programming"));
		System.out.println( string5.startsWith("Hello"));
		System.out.println( string5.startsWith("Java"));
		System.out.println( string5.endsWith("World"));
		System.out.println( string5.endsWith("Java"));
		
		String[] strArr = string5.split(" ");
		for(String eachString : strArr) {
			System.out.println(eachString);
		}
		
		
		System.out.println(string5.replace('l', 'L'));
		System.out.println(string5.replace("a", "A"));
		
		System.out.println(string5.replaceAll("H", "h"));
		System.out.println(string5.replaceAll("[He]", "P"));
		
		String string6 = "Hello Java Hello Programming";
		System.out.println(string6.replaceAll("Hello", "Hi"));
		System.out.println(string6.replaceFirst("Hello", "Hi"));
		
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1==str2);   // binary comparison
		System.out.println(str1==str3);	//false  // binary comparison
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals("Java"));
		System.out.println(str1.equals("java"));
		System.out.println(str1.equalsIgnoreCase("java"));
		
		String string7 = "Abcd12#4ef%*35GHI^$*";
		
		System.out.println(string7.replaceAll("[^A-Z]", ""));
		System.out.println(string7.replaceAll("[^a-z]", ""));
		System.out.println(string7.replaceAll("[^A-Za-z]", ""));
		System.out.println(string7.replaceAll("[^0-9]", ""));
		System.out.println(string7.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(string7.replaceAll("[A-Za-z0-9]", ""));
		
		String string8 = "Hello Java Programming";
		
		System.out.println(string8.substring(0, 5));
		System.out.println(string8.substring(6, 10));
		System.out.println(string8.substring(6));
		

	}

}
