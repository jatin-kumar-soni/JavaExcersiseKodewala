package com.OOpsExcerise.amazon;

public class AmazonCustomer {
	private String username ,email;

	public AmazonCustomer(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}
	
	@Override
	public String toString()
	{
		return ("Email is: "+ this.email + " and  "+"Name is :"+this.username);
	}

}
