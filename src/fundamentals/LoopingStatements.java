package fundamentals;

public class LoopingStatements {

	public static void main(String[] args) {

//		int i = 0;
//
//		for (; i < 1_0;) {
//			System.out.println("Java");
//			i++;
//		}
//		
//		for (int i = 0; i < 10;) {
//			System.out.println("Java");
//			i++;
//		}
//		
		long a = 100_00000_0000_000_00_0L;

		for (int i = 0; i < 10; i++) {
			System.out.println("Java");
		}
		
		int j = 1;
		while(j<=5) {
			System.out.println("Hello");
			j++;
		}

		
		int k = 1; 
		do {
			System.out.println("World");
			k++;
		}while(k<=5);
		

		
		
		for(int i=35; i<=45; i++) {			
			System.out.println("1045 X "+i+" = "+ (1045*i));
		}
		
		
		for(int i = 100009; i<=100020; i++) {
			System.out.println(i);
		}
		
		
		for(int i = 1; i<=3; i++) {
			for(int j1 = 1; j1<=3; j1++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		
		
		for(int i = 1; i<=5; i++) {
			for(int j1 = 1; j1<=i; j1++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int i = 5; i>=1; i--) {
			for(int j1 = 1; j1<=i; j1++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
