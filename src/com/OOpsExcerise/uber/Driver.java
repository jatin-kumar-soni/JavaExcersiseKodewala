package com.OOpsExcerise.uber;

public class Driver {
	protected static int id=100;
	 protected String driverName;
	Driver(String driverName)
	{
		this.driverName=driverName;
		this.id+=1;
	}
	void calculatePay()
	{
		System.out.println("Id: "+this.id);
		System.out.println("Driver: "+this.driverName);
		
	}
	

}
