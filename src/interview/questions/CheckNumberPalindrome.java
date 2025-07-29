package interview.questions;

public class CheckNumberPalindrome {

	public static void checkNumberPalindrome(int number) { // java
		int revNum = 0;
		int tempNum = number;
		while(tempNum > 0) {
			int remainder = tempNum % 10;  // 3, 2, 1
			revNum = (revNum*10) + remainder;  // 0+3 = 3, 30+2 = 32, 320+1= 321
			tempNum = tempNum / 10;  // 12, 1, 0
		}		
		
		if(revNum == number) {
			System.out.println(number+ " is a Palindorme");
		}else {
			System.out.println(number+ " is not a Palindorme");
		}		
	}
	
	public static void main(String[] args) {
		checkNumberPalindrome(121);
		checkNumberPalindrome(123);

	}

}
