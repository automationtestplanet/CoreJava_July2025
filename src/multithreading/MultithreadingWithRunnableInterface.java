package multithreading;

public class MultithreadingWithRunnableInterface {

	public static void main(String[] args) {

		Class3 cls3 = new Class3();
		Class4 cls4 = new Class4();

		Thread thread1 = new Thread(cls3);
		Thread thread2 = new Thread(cls4);

		thread1.start();
		thread2.start();

	}

}
