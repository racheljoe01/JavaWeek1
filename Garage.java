
public class Garage {

	
	public static void main(String [] args) {
		
	
		Vehicle rangeRover = new Car (4, 4, true, "yas", true, 1.5, "its a lot");
		Vehicle harleyDavidson = new Motorcycle ("5", 3.5, "a lot again", true, true, 2);
		Vehicle bostonWhaler = new Boat ("4", 5, "hello", false, true, true);
		
		Garage Josephine = new Garage ();
		rangeRover.calculateBill ();
		String calculateBill = 		bostonWhaler.calculateBill();
System.out.println(calculateBill);
		
	}
 }
