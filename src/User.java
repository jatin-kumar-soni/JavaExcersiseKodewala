
public class User {
	private String userId,name,email;
	private double subscriptionPrice;
	public User(String userId, String name, String email, double subscriptionPrice) {

		this.userId = userId;
		this.name = name;
		this.email = email;
		this.subscriptionPrice = subscriptionPrice;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId() {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		this.email = email;
	}
	public double getSubscriptionPrice() {
		if(subscriptionPrice <0)
		{
			System.out.println("price should not be negative");
			return this.subscriptionPrice;
		}
		return this.subscriptionPrice;
	}
	public void setSubscriptionPrice(double subscriptionPrice) {
		if(subscriptionPrice <0)
		{
			System.out.println("price should not be negative");
			return ;
		}
		this.subscriptionPrice = subscriptionPrice;
	}
	void displayUserDetails()
	{
		System.out.println("User ID				: "+this.getUserId());
		System.out.println("Name   				: "+this.getName());
		System.out.println("Email				: "+this.getEmail());
		System.out.println("Subscription Price  : "+this.getSubscriptionPrice());
	
		
		
	}
	
}
