package com.cognixia.jump;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cognixia.jump.controller.Controller;
import com.cognixia.jump.model.Account;

public class MoneyCreditUnion {

	public static void main(String[] args) {

		List<Account> accounts = new ArrayList<Account>();

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to The Money Credit Union\n");

		boolean loop = true;

		while (loop) {
			System.out.println("\nPlease make a selection");
			System.out.println("1. Login");
			System.out.println("2. Create an account");
			System.out.println("3. Exit\n");
			String choice = input.nextLine();
			int selection = 0;
			try {
				selection = Integer.parseInt(choice);
			} catch (Exception e) {
				System.out.println("\nPlease enter a valid selection\n");
			}
			if (selection == 1) {
				Controller.login(accounts);
			} else if (selection == 2) {
				accounts.add(Controller.createAccount(accounts));
			} else if (selection == 3) {
				loop = false;
			} else {
				System.out.println("\nPlease enter a valid selection\n");
			}

		}

		input.close();

		System.out.println("\nGoodbye");

	}

}
