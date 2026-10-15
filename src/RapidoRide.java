
public class RapidoRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride r1= new Ride("R001","Kodewala Academy","BTM layout 1st stage",88.45);
		Ride r2= new Ride(r1);
		r1.display();
		System.out.println("........\t\nAfter copy\n");
		r2.display();

	}

}
class Ride{
	private String  rideId, pickupLocation, dropLocation;
	private double fare;
	Ride(String  rideId, String pickupLocation, String dropLocation,double fare)
	{
		this.rideId=rideId;
		this.pickupLocation=pickupLocation;
		this.dropLocation=dropLocation;
		this.fare=fare;
		
	}
	Ride(Ride rd)
	{
		this.rideId=rd.rideId;
		this.pickupLocation=rd.pickupLocation;
		this.dropLocation=rd.dropLocation;
		this.fare=rd.fare;
	}
	void display()
	{
		System.out.println("Ride Id			: "+this.rideId);
		System.out.println("Pickup Location : "+this.pickupLocation);
		System.out.println("Drop Location	: "+this.dropLocation);
		System.out.println("fare			: "+this.fare);
		
	}
}
