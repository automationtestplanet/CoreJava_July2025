package assignments.dileep;

public class Assignment1 {
	//Write a reusable code to print Armstrong numbers for the given range
	    public static boolean isArmstrong(int num) {
	        int temp = num;
	        int sum = 0;
	        int digitCount = String.valueOf(num).length();
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += (int) Math.pow(digit, digitCount);
	            temp /= 10;
	        }
	        return sum == num;
	    }

	    public static void printArmstrongNumbers(int start, int end) {
	        for (int num = start; num <= end; num++) {
	            if (isArmstrong(num)) {
	                System.out.print(num +"  " );
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int startRange = 1;
	        int endRange = 1000;
	        printArmstrongNumbers(startRange, endRange);
	    }
	
	 
}
