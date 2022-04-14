package com.cognixia.jump.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String username;
	private String pin;
	private double balance;
	private List<String> transactions=new ArrayList<String>();
	
	

	public Account() {
		super();
		balance=0;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public double getBalance() {
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
