// 1.2.1 Creation of the account class

package components;

public abstract class Account {
	protected String label;
	protected double balance;
	protected int accountNumber;
	protected Client clientNumber;
	
	protected Account(String label, double balance, int accountNumber, Client clientNumber) {
		super();
		this.label = label;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.clientNumber = clientNumber;
	}

	protected String getLabel() {
		return label;
	}

	protected void setLabel(String label) {
		this.label = label;
	}

	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	protected int getAccountNumber() {
		return accountNumber;
	}

	protected void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	protected Client getClientNumber() {
		return clientNumber;
	}

	protected void setClientNumber(Client clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "Account [label=" + label + ", balance=" + balance + ", accountNumber=" + accountNumber
				+ ", clientNumber=" + clientNumber + "]";
	}
}
