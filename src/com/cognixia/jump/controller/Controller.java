package com.cognixia.jump.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import com.cognixia.jump.model.Account;

public class Controller {

	static Scanner input = new Scanner(System.in);

	

	public static Account createAccount(List<Account> accounts) {
		Account newAccount = new Account();
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
				checkUsername=false;
			} else {
				System.out.println("\nSorry that username is already taken\n");
			}
		}
		boolean checkPassword = true;
		while (checkPassword) {
			System.out.println("\nPlease enter a pin");
			String pin1 = input.nextLine();
			System.out.println("\nPlease re-enter your pin");
			String pin2 = input.nextLine();
			if (pin1.equals(pin2)) {
				checkPassword = false;
				newAccount.setPin(pin1);
			} else {
				System.out.println("\nPins do not match try again\n");
			}
		}
		String creationMessage = "Account created at " + LocalDateTime.now();
		newAccount.addTransaction(creationMessage);
		System.out.println("\n"+creationMessage);
		System.out.println("username: "+newAccount.getUsername());
		System.out.println("Pin: " + newAccount.getPin());
		System.out.println("Balance: $" + newAccount.getBalance());
		return newAccount;
	}

}
