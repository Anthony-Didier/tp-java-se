package main;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import components.Account;
import components.Client;
import components.Credit;
import components.CurrentAccount;
import components.Debit;
import components.Flow;
import components.SavingsAccount;
import components.Transfert;

public class Main {
	static LocalDate today = LocalDate.now();
	static LocalDate flowDate = today.plusDays(2);

	// 1.1.2 Creation of main class for tests

	public static Client[] generateClients() {
		Client[] arrClient;
		int numberOfClients = 3;
		arrClient = new Client[numberOfClients];

		for(int i = 0; i < numberOfClients; i++) {
			arrClient[i] = new Client("name", "firstname", i + 1);

			System.out.println(arrClient[i].toString());
		}
		System.out.println(Arrays.toString(arrClient));
		return arrClient;
	}

	// 1.2.3 Creation of the table account

	public static Account[] loadAccounts(Client[] arrClient) {
		Account[] arrAccount = new Account[] {new CurrentAccount("My account", 0, 1, arrClient[0]), new SavingsAccount("My account", 0, 1, arrClient[0])};

		for(Client val: arrClient) {
			System.out.print(val + " balance : 0.00 ");
		}

		return arrAccount;
//		// 1.3.5 Updating accounts (not working)
//		Account[] arrAccount = new Account[] {new CurrentAccount("My account", ("Flow", 1, (-50.00 + 100.50 - 50.00), 1, true, flowDate), 1, arrClient[0]), new SavingsAccount("My account", ("Flow", 2, (-50.00 + 1500.00 - 50.00), 1, true, flowDate), 1, arrClient[0]), new CurrentAccount("My account2", ("Flow", 3, (100.50 + 50.00), 2, true, flowDate), 2, arrClient[1]), new SavingsAccount("My account2", ("Flow", 4, (1500.00 + 50.00), 2, true, flowDate), 2, arrClient[1])};
//
//		for(Client val: arrClient) {
//			System.out.print(val + " balance : 0.00 ");
//		}
//
//		return arrAccount;
	}

	public static void displayAccounts() {
		Client[] arrClient = generateClients();
		Account[] arrAccount = loadAccounts(arrClient);
		System.out.println(Arrays.toString(arrAccount));
	}

	// 1.3.1 Adaptation of the table of accounts

	public static void accountsHashtable() {
		Client[] arrClient = generateClients();
		Account[] arrAccount = loadAccounts(arrClient);
		Hashtable<Integer, Account[]> accounts = new Hashtable<Integer, Account[]>();
		accounts.put(1, arrAccount);

		TreeMap<Integer, Account[]> tm = new TreeMap<Integer, Account[]>(accounts);

		Set<Integer> keys = tm.keySet();
		Iterator<Integer> itr = keys.iterator();

		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i + " " + tm.get(i));
		}
	}

	// 1.3.4 Creation of the flow array

	public static void generateFlows() {
		Flow[] arrFlow = new Flow[] {new Debit("Debit", 1, 50.00, 1, true, flowDate), new Credit("Credit 1", 2, 100.50, 1, true, flowDate), new Credit("Credit 2", 3, 1500.00, 1, true, flowDate), new Transfert("Transfer", 4, 50.00, 1, true, flowDate, 2)};
		System.out.println(Arrays.toString(arrFlow));
	}

	public static void main(String[] args) {
		generateClients();

		Client[] arrClient = generateClients();

		loadAccounts(arrClient);
		displayAccounts();

		accountsHashtable();

		generateFlows();
	}
}