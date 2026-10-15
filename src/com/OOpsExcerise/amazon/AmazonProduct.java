package com.OOpsExcerise.amazon;

public class AmazonProduct {
	protected String productName;
	protected int productPrice;
	public AmazonProduct(String productName, int productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public void displayProduct()
	{
		System.out.println("Product Name: "+this.productName);
		System.out.println("Product Price: "+this.productPrice);
		
	}
	

}
