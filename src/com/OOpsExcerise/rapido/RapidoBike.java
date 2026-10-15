package com.OOpsExcerise.rapido;

public class RapidoBike extends RapidoVehicle {
	private String bikeType;
	RapidoBike(String brand, int year,String bikeType)
	{
		super(brand,year);
		this.bikeType=bikeType;
		
	}
	 void displayBikeDetails()
	{
		super.displayVehicleDetails();
		System.out.println("Bike Type: "+this.bikeType);
	}

}
