import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int cod;
		int qtdProducts;
		double valueFinal = 0.0;
		cod = input.nextInt();
		qtdProducts = input.nextInt();
		
		if(cod == 1)
			valueFinal = qtdProducts * 4.00;
		else if(cod == 2)
			valueFinal = qtdProducts * 4.50;
		else if(cod == 3)
			valueFinal = qtdProducts * 5.00;
		else if(cod == 4)
			valueFinal = qtdProducts * 2.00;
		else if(cod == 5)
			valueFinal = qtdProducts * 1.50;
		
		System.out.println("Total: R$ "+ valueFinal);
		input.close();
	}

}