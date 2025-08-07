package fundamentals;

public class StringClasses {

	public static void main(String[] args) {

		System.out.println("----------------------String class--------------");
		String string1 = "Java"; // immutable string

		System.out.println(string1);

		System.out.println(string1.concat(" World"));

		System.out.println(string1); // String is immutable, if do any operation on sting, it will create a new
										// string.

		string1 = string1.concat(" World");

		System.out.println(string1); // string1 variable pointing to the new string

		System.out.println("----------------------StringBuilder class--------------");
		StringBuilder strBuilder = new StringBuilder("Java"); // mutable string class and method are not synchronized,
																// we can not use it for multi-threading
		System.out.println(strBuilder);

		System.out.println(strBuilder.append(" World"));
		System.out.println(strBuilder);
		System.out.println(strBuilder.reverse());

		System.out.println("----------------------StringBuffer class--------------");
		StringBuffer strBuffer = new StringBuffer("Java"); // mutable string and method are synchronized, we can use it
															// for multi-threading
		System.out.println(strBuffer);

		System.out.println(strBuffer.append(" World"));
		System.out.println(strBuffer);
		System.out.println(strBuffer.reverse());

	}

}
