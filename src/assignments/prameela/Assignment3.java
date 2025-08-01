package assignments.prameela;

public class Assignment3 {

	// Write a program to print the Pyramid pattern
//	           *
//	          * *
//	         * * *
//	        * * * *

	public static void main(String[] args) {
		int rows = 4;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
