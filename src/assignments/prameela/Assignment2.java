package assignments.prameela;

public class Assignment2 {

	// write a reusable code to sort the string -> java : aajv;

	public static void sortString(String First) {
		System.out.println("Before Swaping the String");
		char[] charArr = First.toCharArray();
		for (char eachChar : charArr) {
			System.out.print(eachChar + " ");
		}
		System.out.println(" ");

		for (int i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] > charArr[j]) {
					char char1 = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = char1;
				}
			}
		}
		String sort = new String(charArr);
		System.out.println("After Sorting the String: " + sort);
	}

	public static void main(String[] args) {
		sortString("prameela");
	}
}
