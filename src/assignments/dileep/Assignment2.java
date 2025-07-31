package assignments.dileep;

public class Assignment2 {

	// Write a reusable program to print numbers in this sequence up to 999999
	// Ex: 9, 99, 999, 9999, 99999, 999999

	    public static void main(String[] args) {
	        int limit = 999999; // upper limit

	        printRepeatingNines(limit);
	    }

	    // Reusable method to print numbers like 9, 99, 999, ... up to a limit
	    public static void printRepeatingNines(int max) {
	        int number = 9;

	        while (number <= max) {
	            System.out.print(number);

	            // Check if next number will be within the limit
	            if ((number * 10 + 9) <= max) {
	                System.out.print(", ");
	            }

	            number = number * 10 + 9;
	        }

	        System.out.println(); // new line
	    }

}
