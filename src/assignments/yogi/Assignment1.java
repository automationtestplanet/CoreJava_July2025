package assignments.yogi;

public class Assignment01 {
	public static void printEvennumbers(int startRange, int endRange) {
		
		for(int i = startRange; i <= endRange; i++) {
			
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		printEvennumbers(1, 100);
	}
}
