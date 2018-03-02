
public class grid {

		private int distance;
		private int PlayerX = 0;			
		private int PlayerY = 0;
		private int treasureX;
		private int treasureY;
		
				
		public grid() {
			treasureHunt();
		
		}
		
		int coordinates[][] = new int [500][500];{
			System.out.println("find the treasure");		
		}
		
		public void lookAround () {
			System.out.println("you're in a swamp son! But catch a swamp fish for when you get hungry later");
		
		}
		public void movePlayer (String direction) {
			if (direction.equals("N")) {
				PlayerY++;
		} else if (direction.equals("S")) {
					PlayerY--;
		} else if (direction.equals("E")) {
						PlayerX++;
		} else if (direction.equals("W")) {
						PlayerX--;
		}		
		}
		
		public void treasureHunt() {
			
		treasureX = (int) (5 + Math.round (5 * Math.random()));
		treasureY = (int) (5 + Math.round (5* Math.random()));			
		
		}
	}

