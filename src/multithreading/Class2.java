package multithreading;

public class Class2 extends Thread{

	public void printClass2() {
		for (int i = 0; i < 100; i++) {
			System.out.println("This is Class2");
		}
	}
	
	public void run() {
		printClass2();
	}
}
