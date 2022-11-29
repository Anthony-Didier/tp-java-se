// 1.3.3 Creation of the Transfert, Credit, Debit classes

package components;

import java.util.Date;

public class Debit extends Flow {

	public Debit(String comment, int identifier, double amount, int targetAccountNumber, boolean effect,
			Date dateOfFlow) {
		super(comment, identifier, amount, targetAccountNumber, effect, dateOfFlow);
		// TODO Auto-generated constructor stub
	}

}
