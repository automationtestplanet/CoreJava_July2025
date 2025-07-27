package assignments.raju;

public class Assignment2 {

	// Write a reusable program to check number prime or not (it can divide by 1 or
	// itself)
	public static void checkNumberPrimeOrNot(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count <= 2) {
			System.out.println(number + " is a Prime number");
		} else {
			System.out.println(number + " is not a Prime number");
		}
	}

	public static void main(String[] args) {
		checkNumberPrimeOrNot(91555659);
	}

}
