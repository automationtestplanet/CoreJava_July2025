package multithreading;

public class Class3 implements Runnable {

	public synchronized void printClass3() {
		for (int i = 0; i < 100; i++) {
			System.out.println("This is Class3");
		}
	}

	@Override
	public void run() {		
		printClass3();
	}
}
