package com.OOpsExcerise.amazon;

public class PremiumUser extends PrimeUser {
	public PremiumUser(String name, String email, String subscriptionPlan) {
		super(name, email);
		this.subscriptionPlan = subscriptionPlan;
	}

	private String subscriptionPlan;
	@Override
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Subscription plan: "+this.subscriptionPlan);
	}
}
