package interview.questions;

public class ReverseSentenseWithoutChangingWordsPosition {

	// Reverse the each word in a sentence :
	// "Hello Java World" -> "olleH avaJ dlroW"
	public static void reverseSentenseWithoutChangingWordsPosition(String sentense) {
		String revSentense = "";
		for (String eachWord : sentense.split(" ")) {
			String revWord = "";
			for (char eachChar : eachWord.toCharArray()) {
				revWord = eachChar + revWord;
			}
			revSentense = revSentense + revWord + " ";
		}
		System.out.println(revSentense);
	}

	public static void main(String[] args) {
		reverseSentenseWithoutChangingWordsPosition("Hello Java World");

	}

}
