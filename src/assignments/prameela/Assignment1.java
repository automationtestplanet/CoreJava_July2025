package assignments.prameela;

public class Assignment1 {

	// Write a reusable code to print the numbers divisible by 3 in the given range
	public static void divisibleBy3FromGivenRange(int startVal, int endVal) {
		System.out.println("Numbers divisible by 3 from the Range " + startVal + " to " + endVal + ": ");
		for (int i = startVal; i <= endVal; i++) {
			int number = i;
			if (number % 3 == 0) {
				System.out.print(number + ", ");
			}
		}
	}

	public static void main(String[] args) {
		divisibleBy3FromGivenRange(1, 30);
	}
}
