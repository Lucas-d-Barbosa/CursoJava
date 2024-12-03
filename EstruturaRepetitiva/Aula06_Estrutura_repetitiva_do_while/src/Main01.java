import java.util.Locale;
import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		char verificacao;
		do {
			System.out.printf("Digite a temperatura em Celsius: ");
			double celsius = input.nextDouble();
			double fahrenheit = 9 * celsius / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			verificacao = input.next().charAt(0);
		
		} while(verificacao == 's');
		input.close();
	}

}
