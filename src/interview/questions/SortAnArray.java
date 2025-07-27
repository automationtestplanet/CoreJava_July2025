package interview.questions;

public class SortAnArray {

	// Sort the Array {3,5,2,4,1} -> {1,2,3,4,5}
	public static void sortArray(int[] intArr) {
		System.out.print("Before sort the array: ");
		for (int eachNum : intArr)
			System.out.print(eachNum + " ");

		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] > intArr[j]) {
					int tempNum = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = tempNum;
				}
			}
		}

		System.out.println("");

		System.out.print("After sort the array: ");

		for (int eachNum : intArr)
			System.out.print(eachNum + " ");

	}

	// Bubble Sort
	// 2, 5,3,4,1 -> 1,5,3,4,2
	// 1,3,5,4,2 -> 1,2,5,4,3
	// 1,2,4,5,3 -> 1,2,3,5,4
	// 1,2,3,4,5

	public static void main(String[] args) {
		int[] intArr = { 3, 5, 2, 4, 1 };

		sortArray(intArr);
	}

}
