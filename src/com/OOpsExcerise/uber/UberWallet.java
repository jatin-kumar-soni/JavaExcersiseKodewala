package com.OOpsExcerise.uber;

public class UberWallet {
	protected int balance;

	public UberWallet(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int balance) {
		this.balance += balance;
		System.out.println(balance+" is deposited successfully");
	}
	

}
