// 1.3.3 Creation of the Transfert, Credit, Debit classes

package components;

import java.time.LocalDate;

public class Credit extends Flow {

	public Credit(String comment, int identifier, double amount, int targetAccountNumber, boolean effect,
			LocalDate dateOfFlow) {
		super(comment, identifier, amount, targetAccountNumber, effect, dateOfFlow);
		// TODO Auto-generated constructor stub
	}

}
