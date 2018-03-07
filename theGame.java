import java.util.Scanner;

public class theGame {
	
	double rock;
	double paper;
	double scissors;
	double ties;
	double games;
	double playerWins;
	double cpuWins;

	Scanner scannerObject = new Scanner(System.in);
	
	public void displayStats() {
		double rockPer = this.rock / (this.games*2) * 100;
		
		System.out.println("rocks: " + (int)rock + " " + (rock/(games*2))*100 + "%");
		System.out.println("papers: " + (int)paper +  " " + (paper/ (games*2))*100 + "%");
		System.out.println("sissors " + (int)scissors + " " + (scissors / (games*2))*100 + "%"); 
		System.out.println("ties "+ (int)ties + " " + (ties / games)* 100 + "%");
		System.out.println("games " + (int)games);
		System.out.println("playerWins " + (int)playerWins + " " + (playerWins / games)*100 + "%");
		System.out.println("cpuWins " + (int)cpuWins +  " " + (cpuWins / games)*100 +"%");
	}
	
	public void displayRound(String playerChoice, String cpuChoice, int result) {
		switch(result) {
		case 0:
			System.out.println(playerChoice + " vs " + cpuChoice);
			System.out.println("is a tie son!");
			return;
		case 1: 
			System.out.println(playerChoice + " vs " + cpuChoice);
			System.out.println("Computer Rachel Wins!");
			return;
		case 2:
			System.out.println(playerChoice + " vs " + cpuChoice);
			System.out.println("Shaun Wins!");
		default: return;

		}
	}
	
	public int checkWinner(String cpuChoice) {
		
		switch (cpuChoice) {
		case "rock": 
			this.rock += 1;
			return 0;
			
		case "paper":
			this.paper +=1;
			return 1;
			
		case "scissors":
			this.scissors +=1;
			return 2;
		}
		return 5;
	}
	
	public int playGame(String playerChoice, String cpuChoice) {
		int c = 0;
		switch (playerChoice) {
		case "rock": 
			this.rock += 1; 
			c = checkWinner(cpuChoice);
			if (c == 0) {
			this.ties += 1;
			return 0;
			} 
			else if (c == 1) {
			this.cpuWins += 1;
			return 1;
			} else if (c == 2) {
			this.playerWins += 1;
			return 2;
			}
		case "paper": 
			this.paper += 1; 
			c = checkWinner(cpuChoice);
			if (c == 0) {
			this.playerWins += 1;
			return 2;
			} 
			else if (c == 1) {
			this.ties += 1;
			return 0;
			} else if (c == 2) {
			this.cpuWins += 1;
			return 1;
			} 
		case "scissors": 
			this.scissors += 1; 
			c = checkWinner(cpuChoice);
			if (c == 0) {
			this.cpuWins += 1;
			return 1;
			} 
			else if (c == 1) {
			this.playerWins += 1;
			return 2;
			} else if (c == 2) {
			this.ties += 1;
			return 0;
			}
		default:
			return 10;
		}
	}
}
	