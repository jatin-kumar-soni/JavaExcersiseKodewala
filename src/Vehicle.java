
public class Vehicle {
	private double speed;
	String name,vehicleNumber,typeOfVehicle;
	Vehicle(String name,String vehicleNumber,String typeOfVehicle,double speed)
	{
		this.name=name;
		this.vehicleNumber=vehicleNumber;
		this.typeOfVehicle=typeOfVehicle;
		this.speed=speed;
	}
	double currentSpeed()
	{
			return this.speed;
	}
	double accelrate(double acc)
	{
		if(acc<0)
		{
			System.out.println("speed can't be negative");
			return 0;
		}
	
		return this.speed+acc;
	}
	double brake(double brake)
	{
		this.speed-=brake;
		if(this.speed<0)
		{
			System.out.println("vehicle stops");
			return 0;
		}
		return this.speed;
	}
	void display()
	{
		System.out.println("Vehicle Number: "+this.vehicleNumber);
		System.out.println("Vehicle Name: "+this.name);
		System.out.println("Vehicle Types: "+this.typeOfVehicle);
		
	}

}
