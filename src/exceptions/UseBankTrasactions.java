package exceptions;

public class UseBankTrasactions {

	public static void main(String[] args) {

		BankTransactions icicBank = new BankTransactions();
//		System.out.println(icicBank);

		icicBank.deposit(500000);
		icicBank.checkBalance();

		BankTransactions sbiBank = new BankTransactions();

		sbiBank.withdrawl("SAVING", 10000);
		sbiBank.checkBalance();

		sbiBank.withdrawl("SAVING", 60000);
		
		sbiBank.withdrawl("SAVINGS", 40000);
		sbiBank.checkBalance();

	}
}
