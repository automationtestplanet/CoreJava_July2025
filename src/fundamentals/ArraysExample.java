package fundamentals;

public class ArraysExample {

	public static void main(String[] args) {

//		int a = (100,200,300);
		int[] arr = { 100, 200, 300, 400, 500 };

		System.out.println(arr);

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);

		System.out.println(arr.length);
		System.out.println("---------------------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---------------------------");
		arr[3] = 600;

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

//		arr[-1] = 600; // Error

//		System.out.println(arr[-1]); // Error

		System.out.println("--------------------------------");

		for (int eachInt : arr) {
			System.out.println(eachInt);
		}

		System.out.println("--------------------------------");
		int b;
		b = 200;

		int[] intArr2 = new int[3];
		intArr2[0] = 10;
		intArr2[1] = 20;
		intArr2[2] = 30;

		for (int eachInt : intArr2) {
			System.out.println(eachInt);
		}

		System.out.println("--------------------------------");

//		intArr2[3] = 40;

		int[] intArr3 = { 10, 20, 30 };

		int[] intArr4 = { 100, 200, 300 };

		int[] intArr5 = { 1000, 2000, 3000 };

		int[][] int2DArray = { intArr3, intArr4, intArr5 };

		int[][] int2DArray2 = { { 10, 20, 30 }, { 100, 200, 300 }, { 1000, 2000, 3000 } };

		for (int[] eachArray : int2DArray2) {
			for (int eachValue : eachArray) {
				System.out.print(eachValue + " ");
			}
			System.out.println("");
		}

		System.out.println("--------------------------------");

		for (int i = 0; i < int2DArray2.length; i++) {
			for (int j = 0; j < int2DArray2[i].length; j++) {
				System.out.print(int2DArray2[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("--------------------------------");

		int[][] int2DArray3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int[] eachArray : int2DArray3) {
			for (int eachValue : eachArray) {
				System.out.print(eachValue + " ");
			}
			System.out.println("");
		}
		
		
		
		
//		int[] intArr6 = {100,200,10.5F};
		
		Object[] objArr = {true, 100, 10.5F, 'A', "Java"}; 

	}

}
