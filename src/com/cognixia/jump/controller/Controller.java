package com.cognixia.jump.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cognixia.jump.model.Account;

public class Controller {

	static Scanner input = new Scanner(System.in);

	static Map<String, String> accounts = new HashMap<String, String>();

	public static void createAccount() {
		Account newAccount = new Account();
		boolean checkUsername = true;
		while (checkUsername) {
			System.out.println("/nPlease enter a username");
			String newUsername = input.nextLine();
			checkUsername = false;
			for (String username : accounts.keySet()) {
				if (newUsername == username) {
					checkUsername = true;
				}
			}
			if (!checkUsername) {
				newAccount.setUsername(newUsername);
			}
		}
	}

}
