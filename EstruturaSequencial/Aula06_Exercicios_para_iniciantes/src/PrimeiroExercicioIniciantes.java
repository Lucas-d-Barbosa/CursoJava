import java.util.Locale;
import java.util.Scanner;

public class PrimeiroExercicioIniciantes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numberOne, numberTwo, sum;
		numberOne = sc.nextInt();
		numberTwo = sc.nextInt();
		sum = numberOne + numberTwo;
		System.out.println("Sum = " + sum);
		
		sc.close();
	}

}
