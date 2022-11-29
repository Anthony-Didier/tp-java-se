// 1.3.3 Creation of the Transfert, Credit, Debit classes

package components;

import java.time.LocalDate;

public class Transfert extends Flow {
	protected int accountNumber;

	public Transfert(String comment, int identifier, double amount, int targetAccountNumber, boolean effect,
			LocalDate dateOfFlow, int accountNumber) {
		super(comment, identifier, amount, targetAccountNumber, effect, dateOfFlow);
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Transfert [accountNumber=" + accountNumber + "]";
	}
}
