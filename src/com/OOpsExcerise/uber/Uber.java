package com.OOpsExcerise.uber;

import java.util.Scanner;

public class Uber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		System.out.print("How many Rider you want: ");
//		sc.close();
//		//int n=sc.nextInt();
//		System.out.println("hello");
//
//		for(int i=1;i<=9;i++)
//		{
//			
//		
//			UberRide rider= new UberRide();
//			rider.displayRideDetails();
//			UberDriver driver = new UberDriver();
//			driver.displayBothIds();
//		}
//		DriverWallet driver1 = new DriverWallet(200, 40);
//		
//		driver1.deposit(400);
//		driver1.applyCashback();
		
		Driver driver= new FullTimeDriver("jatin",30000);
		driver.calculatePay();
		Driver pDriver= new PartTimeDriver("jatin",10,1000);
		pDriver.calculatePay();
	}

}
