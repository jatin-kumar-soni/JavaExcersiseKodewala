package com.OOpsExcerise.uber;

public class PartTimeDriver extends Driver{
	private int hoursWorked , hourlyRate;
	void calculatePay()
	{
		System.out.println("Part Time Driver...");
		System.out.println("Driver id: "+this.id);
		System.out.println("Dirver Name: "+this.driverName);
		System.out.println("Payment: "+(this.hourlyRate*this.hoursWorked));
	}
	public PartTimeDriver(String driverName, int hoursWorked, int hourlyRate) {
		super(driverName);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
}
