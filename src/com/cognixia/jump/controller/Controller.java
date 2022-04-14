package com.cognixia.jump.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cognixia.jump.model.Account;

public class Controller {

	static Scanner input = new Scanner(System.in);

	static List<Account> accounts = new ArrayList<Account>();

	public static void createAccount() {
		Account newAccount = new Account();
		boolean checkUsername = true;
		while (checkUsername) {
			System.out.println("/nPlease enter a username");
			String newUsername = input.nextLine();
			checkUsername = false;
			for (Account account : accounts) {
				if (newUsername == account.getUsername()) {
					checkUsername = true;
				}
			}
			if (!checkUsername) {
				newAccount.setUsername(newUsername);
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
	}

}
