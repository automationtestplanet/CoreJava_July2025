package interview.questions;

public class CheckNumberArmstrong {

	// Write a reusable program to check Armstrong number: 1 -> 1^3 = 1, 153 -> 1^3
	// + 5^3 + 3^3 = 1 + 125 + 27 =
	public static void checkNumberArmstrong(int number) {
		int sum = 0;
		int tempNum = number;

		while (tempNum > 0) {
			int remainder = tempNum % 10;
			sum = sum + (remainder * remainder * remainder);
			tempNum = tempNum / 10;
		}

		if (sum == number) {
			System.out.println(number + " is an Armstrong Number");
		} else {
			System.out.println(number + " is not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		checkNumberArmstrong(152);
		checkNumberArmstrong(153);

	}

}
