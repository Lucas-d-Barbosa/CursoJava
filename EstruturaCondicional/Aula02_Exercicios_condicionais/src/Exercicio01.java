import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter with a integer number: ");
		int number = input.nextInt();
		if(number >= 0)
			System.out.print("The number " 
					+ number 
					+ " is positive!");
		else
			System.out.println("The number "
					+number 
					+" is negative!");
		input.close();
	}

}
