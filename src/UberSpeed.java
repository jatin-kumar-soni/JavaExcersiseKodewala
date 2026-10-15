
public class UberSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car= new Vehicle("Aura", "JH014151", "Sedan", 60);
		car.display();
		System.out.println("current speed: "+ car.currentSpeed()+"km/h");
		System.out.println("Pressed Accelrater");
		System.out.println(" After accelerating  :"+(car.accelrate(0))+"km/h");
		System.out.println("Pressed brake");
		System.out.println("After pressing brake: "+car.brake(80)+"km/h");

	}

}
