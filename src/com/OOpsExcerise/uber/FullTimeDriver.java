package com.OOpsExcerise.uber;

public class FullTimeDriver extends Driver {
	private int monthlySalary;

	public FullTimeDriver(String driverName, int monthlySalary) {
		super(driverName);
		this.monthlySalary = monthlySalary;
	}
	void calculatePay()
	{
		System.out.println("Driver id: "+this.id);
		System.out.println("Dirver Name: "+this.driverName);
		System.out.println("Salary: "+this.monthlySalary);
	}

}
