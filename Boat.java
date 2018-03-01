
public class Boat extends Vehicle {

	public boolean Float;
	
	public Boat (String milage, double speedLimit, String fuelTankCapacity, boolean seatBelts, boolean power, boolean Float) {
		super (milage, speedLimit, fuelTankCapacity, seatBelts, power);
		this.Float = Float;
		
	}
	
	public String calculateBill () {
		
		if (Float) {
		return "255,000,00";
		} else {
		return "dont you worry about a thang!";
		}
	}

}