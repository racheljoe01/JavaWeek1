
public class Motorcycle extends Vehicle {

		public int wheels;
		
		public Motorcycle (String Milage, double speedLimit, String fuelTankCapacity, boolean seatBelts, boolean power, int wheels) {
			super(Milage, speedLimit, fuelTankCapacity, seatBelts, power);
	
			this.wheels = wheels;
			
		}
		
		public String calculateBill( ) {
			if (wheels == 2) {
			return "£18,000.00";
			} else {
			return "Not a Bike, son!";
		}
	}
}
