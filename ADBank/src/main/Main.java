package main;

import java.util.Arrays;
import java.util.Hashtable;

import components.Account;
import components.Client;
import components.CurrentAccount;
import components.SavingsAccount;

public class Main {

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
		Account[] arrAccount = new Account[] {new CurrentAccount(null, 0, 0, null), new SavingsAccount(null, 0, 0, null)};

		for(Client val: arrClient) {
			System.out.print(val + " balance : 0.00 ");
		}

		return arrAccount;
	}

	public static void displayAccounts() {
		Client[] arrClient = generateClients();
		Account[] arrAccount = loadAccounts(arrClient);
		System.out.println(Arrays.toString(arrAccount));
	}

	// 1.3.1 Adaptation of the table of accounts

	public static void accountsHashtable() {
		Hashtable<Integer, Account> accounts = new Hashtable<>();
		accounts.put(1, null);
		System.out.println(accounts.get(1));	
	}

	public static void main(String[] args) {
		generateClients();

		Client[] arrClient = generateClients();

		loadAccounts(arrClient);
		displayAccounts();
		
		accountsHashtable();
	}
}