package interview.questions;

public class ReverseNumber {

	// Reverse Number -> 123 : 321
	public static void reverseNumber(int number) {
//			int revNum = 0;
//			
//			while(number > 0) {
//				int remainder = number % 10;  // 3, 2, 1
//				revNum = (revNum*10) + remainder;  // 0+3 = 3, 30+2 = 32, 320+1= 321
//				number = number / 10;  // 12, 1, 0
//			}
//			
//			System.out.println(revNum);

		String revNum = "";
		for (char eachChar : String.valueOf(number).toCharArray()) { // avaj
			revNum = eachChar + revNum;
		}
		System.out.println(number + " Reverse Number : " + revNum);
	}

	public static void main(String[] args) {
		reverseNumber(123);
		reverseNumber(100);

	}

}
