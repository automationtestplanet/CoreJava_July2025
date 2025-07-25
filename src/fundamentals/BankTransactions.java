package fundamentals;

public class BankTransactions {

	static int balanceAmount = 100000;

	public void deposit(int depositAmount) {
		balanceAmount = balanceAmount + depositAmount;
	}

	public void withdrawl(String accountType, int withDrawlAmount) {
		
		if (withDrawlAmount < balanceAmount) {
			switch (accountType) {
				case "SAVINGS":
					if (withDrawlAmount <= 50000) {
						balanceAmount = balanceAmount - withDrawlAmount;
					} else {
						System.out.println("Withdrawl limit for " + accountType
								+ " account should be less than or equals 50000. Please try again");
					}
					break;
				case "CURRENT":
					if (withDrawlAmount <= 500000) {
						balanceAmount = balanceAmount - withDrawlAmount;
					} else {
						System.out.println("Withdrawl limit for " + accountType
								+ " account should be less than or equals 500000. Please try again");
					}
					break;
				case "RETAIL":
					if (withDrawlAmount <= 1000000) {
						balanceAmount = balanceAmount - withDrawlAmount;
					} else {
						System.out.println("Withdrawl limit for " + accountType
								+ " account should be less than or equals 1000000. Please try again");
					}
					break;
			}
		} else {
			System.out.println("Insufficient Balance and Current balance is: " + balanceAmount);
		}
	}

	public void checkBalance() {
		System.out.println("Balance Amount: " + balanceAmount);
	}

	public static void main(String[] args) {

		BankTransactions icicBank = new BankTransactions();
//		System.out.println(icicBank);
		
		icicBank.deposit(500000);
		icicBank.checkBalance();

		BankTransactions sbiBank = new BankTransactions();

		sbiBank.withdrawl("SAVINGS", 10000);
		sbiBank.checkBalance();

		sbiBank.withdrawl("SAVINGS",60000);

	}

}
