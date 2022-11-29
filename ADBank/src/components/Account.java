// 1.2.1 Creation of the account class

package components;

public abstract class Account {
	protected String label;
	protected Flow balance;
	protected int accountNumber;
	protected Client client;
	
	protected Account(String label, Flow balance, int accountNumber, Client client) {
		super();
		this.label = label;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.client = client;
	}

	protected String getLabel() {
		return label;
	}

	protected void setLabel(String label) {
		this.label = label;
	}

	protected Flow getBalance() {
		return balance;
	}
	
	// 1.3.5 Updating accounts

	protected void setBalance(Flow balance) {
		this.balance = balance;
	}

	protected int getAccountNumber() {
		return accountNumber;
	}

	protected void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	protected Client getClient() {
		return client;
	}

	protected void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Account [label=" + label + ", balance=" + balance + ", accountNumber=" + accountNumber
				+ ", client=" + client + "]";
	}
}
