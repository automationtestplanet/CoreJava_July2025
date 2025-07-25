package assignments.raju;

public class Assignment1 {

	//Write a reusable code to print the prime numbers for the given range
	public static void printPrimeNumbers(int startRange, int endRange) {
		
		for(int i = startRange; i <=endRange; i++ ) {
			int count = 0;
			
			for(int j = 1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			
			if(count<=2) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		printPrimeNumbers(1,100);
	}
}
