package multithreading;

public class Class4 implements Runnable {

	public synchronized void printClass4() {
		for (int i = 0; i < 100; i++) {
			System.out.println("This is Class4");
		}
	}

	@Override
	public void run() {
		printClass4();
	}
}
