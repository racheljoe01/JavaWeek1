
public class DoggoCompetition {

	public static void main(String[] args) {
	
		doggo(56);
	}
	
	public static void doggo(int x) {
		for(int i = 0; i <= 100; i++) {
			if (x!=i) {
				if (x == 11 && x == 12 && x == 13) {
				System.out.print(i+"th, ");
				} else {
					switch (i % 10) {
					case 0:
						System.out.print( i + "th, ");
						break;
					case 1: 
						System.out.print( i+ "st, ");
						break;
					case 2: 
						System.out.print( i+ "nd, ");
						break;
					case 3: 
						System.out.print( i+ "rd, ");
						break;
					case 4: 
						System.out.print( i+ "th, ");
						break;
					case 5: 
						System.out.print( i + "th, ");
						break;
					case 6: 
						System.out.print( i + "th, ");
						break;
					case 7: 
						System.out.print( i + "th, ");
						break;
					case 8: 
						System.out.print( i + "th, ");
						break;
					case 9: 
						System.out.print( i + "th, ");
						break;
					}
				}
			} else {
				System.out.print("X, ");
			}
		}
	}
	
	
}
