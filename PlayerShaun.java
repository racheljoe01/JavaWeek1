import java.util.Scanner;

public class PlayerShaun {

	private int wins;
	
	Scanner input = new Scanner(System.in);


	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}
	
	public String playerChoice() {
		boolean userChoice = true;
		
		do {
			System.out.println("Please choose your move - rock, paper or scissors? Remember, if you wanna quit, just type 'Q'.");
			String userMove = input.nextLine();
			System.out.println(userMove);
			if (userMove.equalsIgnoreCase("Rock") || userMove.equalsIgnoreCase("Paper") || userMove.equalsIgnoreCase("scissors") || userMove.equalsIgnoreCase("Q")) {
				userChoice = false;
				return userMove;
			} else {
				System.out.println("nope, try again");
			}	
		} while (userChoice);
		return null;
	}
	
	public String cpuChoice() {
		int a = (int) Math.round( Math.random()*2);
		
		switch (a) {
		case 0: return "rock";
		case 1: return "paper";
		case 2: return "scissors";
		default: return null;
		} 
	}
}



