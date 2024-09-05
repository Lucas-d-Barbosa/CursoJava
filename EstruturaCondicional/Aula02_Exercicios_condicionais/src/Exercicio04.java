import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startTime;
		int finalTime;
		
		startTime = input.nextInt();
		finalTime = input.nextInt();
		
		if(startTime == finalTime)
			System.out.println("The game lasted 24 hour(s)");
		else if(startTime > finalTime)
			System.out.println("The game lasted " + ((24- startTime) + finalTime)  + " hour(s)");
		else
			System.out.println("The game lasted " + (finalTime - startTime) + " hour(s)");
		input.close();
	}

}
