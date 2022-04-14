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
		Account account=findAccount(accounts);
		checkPin(account);
		homePage(account);
	}
	
	private static Account findAccount(List<Account> accounts) {
		boolean checkUsername = true;
		while (checkUsername) {
			System.out.println("\nPlease enter your username\n");
			String userInput=input.nextLine();
			for(Account account : accounts) {
				if(userInput==account.getUsername()) {
					return account;
				}
			}
			System.out.println("\nAccount not found. Please try again\n");
		}
		return null;
	}
	
	private static void checkPin(Account account) {
		boolean checkPin=true;
		while(checkPin) {
			System.out.println("\nPlease enter your pin\n");
			String userInput=input.nextLine();
			if(userInput.equals(account.getPin())) {
				checkPin=false;
			} else {
				System.out.println("\nAccess Denied\n");
			}
		}
	}
	
	private static void homePage(Account account) {
		
	}

}
