package exceptions;

public class BankTrasactionException extends RuntimeException{
	public BankTrasactionException(String message) {
		System.out.println(message);
	}
}
