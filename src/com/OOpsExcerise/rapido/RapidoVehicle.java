package com.OOpsExcerise.rapido;

public class RapidoVehicle {
	protected String brand;
	protected int year;
	public RapidoVehicle(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}
	public void displayVehicleDetails()
	{
		System.out.println("Brand: "+this.brand);
		System.out.println("year: "+this.year);
	}
}
