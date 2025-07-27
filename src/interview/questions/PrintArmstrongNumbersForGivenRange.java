package interview.questions;

public class PrintArmstrongNumbersForGivenRange {

	// print all Armstrong numbers between 1 and 1000
	public static void printArmstrongNumbersForGivenRange(int startVal, int endVal) {
		for (int i = startVal; i <= endVal; i++) {
			int sum = 0;
			int tempNum = i;

			while (tempNum > 0) {
				int remainder = tempNum % 10;
				sum = sum + (remainder * remainder * remainder);
				tempNum = tempNum / 10;
			}

			if (sum == i) {
				System.out.println(i + " is an Armstrong Number");
			}
		}

	}

	public static void main(String[] args) {
		printArmstrongNumbersForGivenRange(1, 1000000);
	}

}
