package com.OOpsExcerise.amazon;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PrimeVideoProfile user1= new PrimeVideoProfile();
//		user1.setProfileName("jatin", user1);
//		
//		user1.setQuality("HD", user1);
//		user1.setDownloadLimit("2GB", user1);
//		user1.displayProfile();
		
		// Inheritance concept
//		PrimeUser user1 = new PrimeUser("Jatin", "jatin@gmail.com");
//
//		PrimeUser user2 = new PremiumUser("Jatin", "jatin@gmail.com","Premium");
//		user2.displayDetails();
		
//		PerishableProduct p1= new PerishableProduct("Paneer", 400, "10th of october 2026", "store in cool area");
//		
//		p1.displayProduct();
//		p1.displayExpiryInformation();
		AmazonCustomerDirectory[] customers = {

			    new AmazonCustomerDirectory(1001, "Rahul Sharma"),
			    new AmazonCustomerDirectory(1002, "Priya Patel"),
			    new AmazonCustomerDirectory(1003, "Amit Kumar"),
			    new AmazonCustomerDirectory(1004, "Sneha Reddy"),
			    new AmazonCustomerDirectory(1005, "Arjun Mehta"),
			    new AmazonCustomerDirectory(1006, "Neha Singh"),
			    new AmazonCustomerDirectory(1007, "Rohit Verma"),
			    new AmazonCustomerDirectory(1008, "Ananya Gupta"),
			    new AmazonCustomerDirectory(1009, "Vikram Joshi"),
			    new AmazonCustomerDirectory(1010, "Pooja Nair"),

			    new AmazonCustomerDirectory(1011, "Karan Malhotra"),
			    new AmazonCustomerDirectory(1012, "Isha Shah"),
			    new AmazonCustomerDirectory(1013, "Manish Agarwal"),
			    new AmazonCustomerDirectory(1014, "Kavya Iyer"),
			    new AmazonCustomerDirectory(1015, "Suresh Rao"),
			    new AmazonCustomerDirectory(1016, "Meera Kapoor"),
			    new AmazonCustomerDirectory(1017, "Aditya Desai"),
			    new AmazonCustomerDirectory(1018, "Riya Mishra"),
			    new AmazonCustomerDirectory(1019, "Nikhil Bansal"),
			    new AmazonCustomerDirectory(1020, "Divya Menon")
			};

		
		AmazonCustomer amazon = new AmazonCustomer("Jatin", "jatin@gmail.com");
		System.out.println(amazon);
	
	}

}
