package exceptions;

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
					throw new BankTrasactionException("Withdrawl limit for " + accountType
							+ " account should be less than or equals 50000. Please try again");
				}
				break;
			case "CURRENT":
				if (withDrawlAmount <= 500000) {
					balanceAmount = balanceAmount - withDrawlAmount;
				} else {
					throw new BankTrasactionException("Withdrawl limit for " + accountType
							+ " account should be less than or equals 500000. Please try again");
				}
				break;
			case "RETAIL":
				if (withDrawlAmount <= 1000000) {
					balanceAmount = balanceAmount - withDrawlAmount;
				} else {
					throw new BankTrasactionException("Withdrawl limit for " + accountType
							+ " account should be less than or equals 1000000. Please try again");
				}
				break;
			}
		} else {
			throw new BankTrasactionException("Insufficient Balance and Current balance is: " + balanceAmount);
		}
	}

	public void checkBalance() {
		System.out.println("Balance Amount: " + balanceAmount);
	}

}
