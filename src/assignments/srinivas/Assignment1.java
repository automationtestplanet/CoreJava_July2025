package assignments.srinivas;

public class Assignment1 {
	//Write a reusable code to print the odd numbers from the given 

	public static void printOddNumbersFromArrray(int[] arr) {
		for(int eachnum : arr) {
			if (eachnum %2 != 0) {
				System.out.println(eachnum);
			}
			
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,11,60,6,71,85,9,10};
		printOddNumbersFromArrray(arr1);
	}
		
}
