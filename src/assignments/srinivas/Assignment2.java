package assignments.srinivas;

public class Assignment2 {

	// write a reusable program to sort the number 25341 : 12345
	public static void numberSortingInAscendingOrder(int number) {

		int tempNum = number;
		int count = 0;
		int sortedNumber = 0;
		while (tempNum > 0) {
			count++;
			tempNum = tempNum / 10;
		}
		tempNum = number;
		int[] arr = new int[count];
		for (int i = count - 1; i >= 0; i--) {
			arr[i] = tempNum % 10;
			tempNum = tempNum / 10;

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tempNum = arr[i];
					arr[i] = arr[j];
					arr[j] = tempNum;
				}
			}
		}

		for (int eachNum : arr)
			sortedNumber = sortedNumber * 10 + eachNum;

		System.out.println("Sorted Number = " + sortedNumber);

	}

	public static void main(String[] args) {
		numberSortingInAscendingOrder(25341);

	}
}
