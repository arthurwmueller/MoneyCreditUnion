package com.cognixia.jump.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import com.cognixia.jump.model.Account;

public class Controller {

	static Scanner input = new Scanner(System.in);

	public static Account createAccount(List<Account> accounts) {
		Account newAccount = new Account();
		newAccount = createUsername(accounts, newAccount);
		newAccount = createPassword(newAccount);
		String creationMessage = "Account created at " + LocalDateTime.now();
		newAccount.addTransaction(creationMessage);
		System.out.println("\n" + creationMessage);
		System.out.println("username: " + newAccount.getUsername());
		System.out.println("Pin: " + newAccount.getPin());
		System.out.println("Balance: $" + newAccount.getBalance());
		return newAccount;
	}

	private static Account createUsername(List<Account> accounts, Account newAccount) {
		boolean checkUsername = true;
		while (checkUsername) {
			System.out.println("\nPlease enter a username");
			String newUsername = input.nextLine();
			boolean duplicate = false;
			for (Account account : accounts) {
				if (newUsername.equals(account.getUsername())) {
					duplicate = true;
				}
			}
			if (!duplicate) {
				newAccount.setUsername(newUsername);
				checkUsername = false;
			} else {
				System.out.println("\nSorry that username is already taken\n");
			}
		}
		return newAccount;
	}

	private static Account createPassword(Account newAccount) {
		boolean checkPin = true;
		while (checkPin) {
			System.out.println("\nPlease enter a pin");
			String pin1 = input.nextLine();
			System.out.println("\nPlease re-enter your pin");
			String pin2 = input.nextLine();
			if (pin1.equals(pin2)) {
				checkPin = false;
				newAccount.setPin(pin1);
			} else {
				System.out.println("\nPins do not match try again\n");
			}
		}
		return newAccount;
	}

	public static void login(List<Account> accounts) {
		Account account = findAccount(accounts);
		checkPin(account);
		homePage(account);
	}

	private static Account findAccount(List<Account> accounts) {
		boolean checkUsername = true;
		while (checkUsername) {
			System.out.println("\nPlease enter your username\n");
			String userInput = input.nextLine();
			for (Account account : accounts) {
				if (userInput == account.getUsername()) {
					return account;
				}
			}
			System.out.println("\nAccount not found. Please try again\n");
		}
		return null;
	}

	private static void checkPin(Account account) {
		boolean checkPin = true;
		while (checkPin) {
			System.out.println("\nPlease enter your pin\n");
			String userInput = input.nextLine();
			if (userInput.equals(account.getPin())) {
				checkPin = false;
			} else {
				System.out.println("\nAccess Denied\n");
			}
		}
	}

	private static void homePage(Account account) {
		System.out.println("\nUser " + account.getUsername() + " Welcome to The Money Credit Union\n");
		boolean loop = true;
		while (loop) {
			System.out.println("\nPlease make a selection");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Transfer");
			System.out.println("4. Recent transactions");
			System.out.println("5. User information");
			System.out.println("6. Sign Out");
			String choice = input.nextLine();
			int selection = 0;
			try {
				selection = Integer.parseInt(choice);
			} catch (Exception e) {
				System.out.println("\nPlease enter a valid selection\n");
			}
			if (selection == 1) {
				deposit(account);
			} else if (selection==2) {
				withdraw(account);
			} else if (selection == 3) {
				transfer(account);
			} else if (selection == 4) {
				transactions(account);
			} else if (selection == 5) {
				info(account);
			} else if (selection == 6) {
				loop = false;
			} else {
				System.out.println("\nPlease enter a valid selection\n");
			}
		}
	}

	private static void info(Account account) {
		System.out.println();
		System.out.println("Hello user "+account.getUsername());
		System.out.println("Your PIN is "+account.getPin());
		System.out.println("Your account balance is $"+account.getBalance());
		System.out.println();
	}

	private static void transactions(Account account) {
		// TODO Auto-generated method stub
		
	}

	private static void transfer(Account account) {
		// TODO Auto-generated method stub
		
	}

	private static void withdraw(Account account) {
		// TODO Auto-generated method stub
		
	}

	private static void deposit(Account account) {
		// TODO Auto-generated method stub
		
	}

}
