import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter with two numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a % b == 0 || b % a == 0)
			System.out.print("They are multiple!");
		else
			System.out.print("They are not multiple");
		input.close();
	}
}
