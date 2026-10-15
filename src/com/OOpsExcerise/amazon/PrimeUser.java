package com.OOpsExcerise.amazon;

public class PrimeUser {
	protected String name,email;

	public PrimeUser(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	void displayDetails()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Email: "+this.email);
	}
	

}
