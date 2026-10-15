
public class JioHotstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterUser user1= new RegisterUser();
		user1.displayDetails();
//		RegisterUser user2= new RegisterUser("Jatin");
//		user2.displayDetails();
//		RegisterUser user3= new RegisterUser("AMan",25,9999);
//		user3.displayDetails();

	}

}
class RegisterUser
{
	private String name;
	private int age,subscriptionPlan;
	RegisterUser()
	{
	this("guestUser",0,999);
		

		
	}
	RegisterUser(String name)
	{
		this.name=name;
	}
	RegisterUser(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	RegisterUser(String name,int age,int subscriptionPlan)
	{
		this.age=age;
		this.name=name;
		this.subscriptionPlan=subscriptionPlan;
	}
	void displayDetails()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Subscription Plan: "+this.subscriptionPlan);
	}
	
}