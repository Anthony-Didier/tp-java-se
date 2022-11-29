package main;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

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
		Account[] arrAccount = new Account[] {new CurrentAccount("My account", 0, 1, arrClient[0]), new SavingsAccount("My account", 0, 1, arrClient[0])};

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

	public static void main(String[] args) {
		generateClients();

		Client[] arrClient = generateClients();

		loadAccounts(arrClient);
		displayAccounts();
		
		accountsHashtable();
	}
}