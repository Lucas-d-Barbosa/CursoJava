import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Enter with one number: ");
		number = input.nextInt();
		if(number % 2 == 0)
			System.out.print("The number is even!");
		else
			System.out.print("The number is odd!");
		input.close();
	}

}
