
public class Car extends Vehicle {

	public int doors;
	
	public Car (int wheels, int doors, boolean seatBelts, String Milage, boolean power, double speedLimit, String fuelTankCapacity) {
		super(Milage, speedLimit, fuelTankCapacity, seatBelts, power);
		this.doors = doors;
	}

	public String calculateBill( ) {
		if (doors < 4) {
		return "£37,600.00";
		} else {
		return "Not Car";
		}
	}
}
