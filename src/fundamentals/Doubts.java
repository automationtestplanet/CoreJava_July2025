package fundamentals;

public class Doubts {
	
	String str1 = "Java";
	String str2 = "Hello";
	
	public Doubts(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}
	
	public void displyGlobalData() {
		System.out.println("String1: "+ this.str1);
		System.out.println("String2: "+ this.str2);
	}

	public static void main(String[] args) {
		
		Doubts d1 = new Doubts("Hello","Java");
		d1.displyGlobalData();
	}

}
