
public class runner {

	public static void main (String [] args) {
		
		theGame rps = new theGame();
		PlayerShaun shaun = new PlayerShaun();
		PlayerShaun cpuRachel = new PlayerShaun();
		boolean playing = true;
		int result = 0;
		
		while (playing) {
			String playerChoice = shaun.playerChoice();
			String cpuChoice = cpuRachel.cpuChoice();
			if(playerChoice.equalsIgnoreCase("Q")) {
				playing = false;
			} else {
			result = rps.playGame(playerChoice, cpuChoice);
			rps.games += 1;
			rps.displayRound(playerChoice, cpuChoice, result);
			}
			if (rps.games >= 10) {
				playing = false;
			}
		}
		System.out.println("The game has ended");
		rps.displayStats();
		
		
	}
}
