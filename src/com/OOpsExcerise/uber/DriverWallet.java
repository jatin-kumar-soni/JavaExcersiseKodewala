package com.OOpsExcerise.uber;

public class DriverWallet extends UberWallet {
	private int cashbackRate;

	public DriverWallet(int balance, int cashbackRate) {
		super(balance);
		this.cashbackRate = cashbackRate;
	}
	
	void applyCashback()
	{
		if(super.getBalance() > 200)
		{
			System.out.println("you get cashBack of "+this.cashbackRate);
		}
	}
}
