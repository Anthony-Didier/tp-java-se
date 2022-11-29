// 1.3.3 Creation of the Transfert, Credit, Debit classes

package components;

import java.util.Date;

public class Transfert extends Flow {
	protected Account accountNumber;

	public Transfert(String comment, int identifier, double amount, int targetAccountNumber, boolean effect,
			Date dateOfFlow, Account accountNumber) {
		super(comment, identifier, amount, targetAccountNumber, effect, dateOfFlow);
		this.accountNumber = accountNumber;
	}

	public Account getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Account accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Transfert [accountNumber=" + accountNumber + "]";
	}
}
