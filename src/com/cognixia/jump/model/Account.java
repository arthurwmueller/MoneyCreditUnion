package com.cognixia.jump.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String username;
	private String pin;
	private int balance;
	private List<String> transactions=new ArrayList<String>();
	
	

	public Account() {
		super();
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getTransactions() {
		return transactions;
	}

	public List<String> addTransaction(String transaction){
		transactions.add(transaction);
		return transactions;
	}
	
}
