package com.cognixia.jump.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String username;
	private String password;
	private int balance;
	private List<String> transactions=new ArrayList<String>();
	
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
	public List<String> getTransactions() {
		return transactions;
	}

	public List<String> addTransaction(String transaction){
		transactions.add(transaction);
		return transactions;
	}
	
}
