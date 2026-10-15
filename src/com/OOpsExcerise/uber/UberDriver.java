package com.OOpsExcerise.uber;

public class UberDriver extends Driver {
	static int id=200;

	public UberDriver() {
		super("");
		this.id+=1;
	}
	public void displayBothIds()
	{
		System.out.println(" Parent - DRIVER - "+super.id);
		System.out.println(" Child - UBER - "+this.id);
	}
	
}
