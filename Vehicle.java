
public abstract class Vehicle {

	public String Milage;
	public boolean power;
	public double speedLimit;
	public String fuelTankCapacity;
	public boolean seatBelts;
	
	
	public Vehicle (	String Milage, double speedLimit, String fuelTankCapacity, boolean seatBelts, boolean power) {
		this.Milage = Milage;
		this.power = power;
		this.speedLimit = speedLimit;
		this.fuelTankCapacity = fuelTankCapacity; 	
		this.seatBelts = seatBelts;
	}
	public abstract String calculateBill (); 
		
}