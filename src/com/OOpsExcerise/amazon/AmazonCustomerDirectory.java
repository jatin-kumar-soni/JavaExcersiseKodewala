package com.OOpsExcerise.amazon;

public class AmazonCustomerDirectory {
	private int userID;
	private String userName;
	public AmazonCustomerDirectory(int userID, String userName) {
		super();
		this.userID = userID;
		this.userName = userName;
	}
	void search(int id)
	{
		if(this.userID == id)
		{
			System.out.println("Search based on user id");
			System.out.println("User id: "+this.userID);
			System.out.println("User Name: "+this.userName);
		}
		
	}
	void search(int id,String name)
	{
		if(this.userID == id && this.userName.equals(name))
		{
			System.out.println("Search based on user id and user Name");
			System.out.println("User id: "+this.userID);
			System.out.println("User Name: "+this.userName);
		}
		
	}
}
