
public class RapidoCaptain {
	private  String captainId, captainName ;
	private double totalEarnings;
	public RapidoCaptain(String captainId, String captainName, double totalEarnings) {
		super();
		this.captainId = captainId;
		this.captainName = captainName;
		this.totalEarnings = totalEarnings;
	}
	void addRideEarning(double fare)
	{
		if(fare>=0)
		{
		
			this.totalEarnings+=fare;
			
		}
		else {
			System.out.println("invaild fare amount");
		}
	}
	void getTotalEarnings()
	{
		System.out.println("Total Earning is: " +this.totalEarnings );
	}
	void displayCaptainDetails() {
		//System.out.println("Captain Id: "+this.captainId);
		System.out.println("Captain Name: "+this.captainName);
		this.getTotalEarnings();
		
	}
}
