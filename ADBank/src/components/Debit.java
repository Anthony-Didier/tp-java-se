// 1.3.3 Creation of the Transfert, Credit, Debit classes

package components;

import java.time.LocalDate;

public class Debit extends Flow {

	public Debit(String comment, int identifier, double amount, int targetAccountNumber, boolean effect,
			LocalDate localDate) {
		super(comment, identifier, amount, targetAccountNumber, effect, localDate);
		// TODO Auto-generated constructor stub
	}

}
