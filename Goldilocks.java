
public class Goldilocks {

	public static void main(String[] args) {
		
		int [] porridgeTemp = {90, 110, 113, 191, 129, 163, 193, 153, 147, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
		int [] chairCapacity = {297, 66, 257, 278, 280, 219, 254, 86, 206, 71, 104, 238, 52, 129, 144, 157, 210, 11, 268, 261, 12, 186, 174, 77, 54, 174, 16, 59, 290, 248}	;	
		
		int goldilocksWeight = 100;
		int maxTempPorridge = 120;
	
		for(int i = 0; i < porridgeTemp.length; i++) { 
			if ((porridgeTemp[i] <= maxTempPorridge) && (chairCapacity[i] >= goldilocksWeight)) {
				System.out.println("Chair " + (i+1) + " is totally rad man");
		}
	 } 
  }
}
