package com.OOpsExcerise.rapido;

public class Driver {
	protected String name;
	protected int baseEarnings;

	public Driver(String name, int baseEarnings) {
		super();
		this.name = name;
		this.baseEarnings = baseEarnings;
	}

	void displayProfile() {
		System.out.println("Name: " + this.name);
		System.out.println("Base Earnings: " + this.baseEarnings);

	}

	void calculateEarnings() {
		System.out.println("Earnings: "+(this.baseEarnings));
	}

}
