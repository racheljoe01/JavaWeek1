import java.util.Scanner;

class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		theman a = new theman ();
		welcomeMessage("elliott");
		welcomeInstructions();
		
	}
	Scanner input = new Scanner (System.in);
	
	public static void welcomeMessage (String name) {
		System.out.println("Hello " + name);
	}
	public static void welcomeInstructions () {
		System.out.println ("I know you're lost. Try moving about.");
	}
}
