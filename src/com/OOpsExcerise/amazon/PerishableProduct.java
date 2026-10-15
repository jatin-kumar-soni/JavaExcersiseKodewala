package com.OOpsExcerise.amazon;

public class PerishableProduct extends AmazonProduct {
	protected String expiryDate , storageInstruction;

	public PerishableProduct(String productName, int productPrice, String expiryDate, String storageInstruction) {
		super(productName, productPrice);
		this.expiryDate = expiryDate;
		this.storageInstruction = storageInstruction;
	}
	void displayExpiryInformation()
	{
		System.out.println("Expires in: "+this.expiryDate);
		System.out.println("Storeage Instruction: "+this.storageInstruction);
	}

}
