package multithreading;

public class Class1 extends Thread{

	public void printClass1() {
		for (int i = 0; i < 100; i++) {
			System.out.println("This is Class1");
		}
	}
	
	public void run() {
		printClass1();
	}
}
