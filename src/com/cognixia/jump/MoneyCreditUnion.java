package com.cognixia.jump;

import java.util.Scanner;

public class MoneyCreditUnion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Money Credit Union\n");

		boolean loop = true;

		while (loop) {
			System.out.println("\nPlease make a selection");
			System.out.println("1. Login");
			System.out.println("2. Create an account");
			System.out.println("3. Exit\n");
			int selection = input.nextInt();
			if (selection == 1) {

			} else if (selection == 2) {

			} else if (selection == 3) {
				loop = false;
			}
		}

		input.close();

		System.out.println("\nGoodbye");

	}

}
