package multithreading;

public class MultithreadingWithThreadClass {

	public static void main(String[] args) {

		Class1 cls1 = new Class1();
		Class2 cls2 = new Class2();
		
//		cls1.printClass1();
//		cls2.printClass2();

		
		Thread thread1 = new Thread(cls1);
		Thread thread2 = new Thread(cls2);
		
		thread1.start();
		thread2.start();
		
		
	}

}
