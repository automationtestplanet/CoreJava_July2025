package exceptions;

public class TryCatchFinallyBlocks {

	public static void main(String[] args) {

		try {
			System.out.println("Database is opened");
			int a = 100;
			int b = 10;
			System.out.println(a / b);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("Database is closed");
		}

	}

}
