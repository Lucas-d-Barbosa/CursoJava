import java.util.Scanner;
import java.util.Locale;
public class QuintoExercicioIniciantes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int codOne, codTwo, numbersProductOne, numbersProductTwo;
		double valueProductOne, valueProductTwo, finalValue;
		codOne = input.nextInt();
		numbersProductOne = input.nextInt();
		valueProductOne = input.nextDouble();
		
		codTwo = input.nextInt();
		numbersProductTwo = input.nextInt();
		valueProductTwo = input.nextDouble();
		
		finalValue = numbersProductOne * valueProductOne + numbersProductTwo * valueProductTwo;
		
		System.out.printf("VALOR A PAGAR: %.2f", finalValue);
		input.close();
	}
}