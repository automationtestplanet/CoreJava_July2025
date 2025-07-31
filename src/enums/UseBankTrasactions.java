package enums;

public class UseBankTrasactions {

	public static void main(String[] args) {

		BankTransactions icicBank = new BankTransactions();
//		System.out.println(icicBank);

		icicBank.deposit(500000);
		icicBank.checkBalance();

		BankTransactions sbiBank = new BankTransactions();

		sbiBank.withdrawl(AccountType.SAVINGS, 10000);
		sbiBank.checkBalance();

		sbiBank.withdrawl(AccountType.SAVINGS, 60000);
		
		sbiBank.withdrawl(AccountType.SAVINGS, 40000);
		sbiBank.checkBalance();

	}
}
