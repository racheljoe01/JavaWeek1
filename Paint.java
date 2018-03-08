
public class Paint {

	public String name;
	public double pricePerTin;
	public int ltrsPerTin;
	public int areaCoveredPerLtr;
	public double areaToBeCovered;
	
	
	public Paint (String name, double pricePerTin, int ltrsPerTin, int areaCoveredPerLtr) {
		this.name = name;
		this.pricePerTin = pricePerTin;
		this.ltrsPerTin = ltrsPerTin;
		this.areaCoveredPerLtr = ltrsPerTin * areaCoveredPerLtr;
		
	} 
	public double caulateBill(double areaToBeCovered) {
		if (areaToBeCovered !=0) {
			int tinsNeeded; 
			
			
			if (areaToBeCovered > areaCoveredPerLtr) {
				if (areaToBeCovered % areaCoveredPerLtr == 0) {
					tinsNeeded =  (int) (areaToBeCovered / areaCoveredPerLtr);
					double price = tinsNeeded * pricePerTin;
					return price;
				} else {
					tinsNeeded = (int) ((areaToBeCovered/areaCoveredPerLtr) +1);
					double price = tinsNeeded * pricePerTin;
					return price; 
				}
			}
			else {
				tinsNeeded = 1;
				double price = tinsNeeded * pricePerTin;
				return price;
			}
		}
		return 00.00;
	}		
}


