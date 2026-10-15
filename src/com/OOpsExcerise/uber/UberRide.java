package com.OOpsExcerise.uber;

public class UberRide {
	private static int rideCounter=0;
	private  int rideId;

	public UberRide() {
		this.rideCounter+=1;

	}
//	int getRideId()
//	{
////		this.rideId=this.rideCounter;
//		return this.rideCounter;
//	}
	void displayRideDetails()
	{
		
		System.out.println("Ride ID: UBER -"+this.rideCounter);
	}
	
}
