package com.OOpsExcerise.rapido;

public class Rapido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RapidoBike v1= new RapidoBike("Honda", 2026, "Electirc");
////		v1.displayVehicleDetails();
//		v1.displayBikeDetails();
		
		Driver captain= new RapidoCaptain("Jatin", 129, 50);

		captain.displayProfile();
		captain.calculateEarnings();
		
	}

}
