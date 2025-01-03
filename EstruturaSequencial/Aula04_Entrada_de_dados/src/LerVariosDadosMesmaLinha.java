import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class LerVariosDadosMesmaLinha {
	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			int idade;
			double salario;
			String nome;
			char sexo;
			
			nome = sc.next();
			sexo = sc.next().charAt(0);
			idade = sc.nextInt();
			salario = sc.nextDouble();
			
			System.out.printf("Seu nome é %s."
					+ " Você tem %d anos, é do sexo "
					+ "%s e ganha %.2f", 
					nome, idade, sexo, salario);
			
			sc.close();
		} catch(InputMismatchException e) {
			System.out.println("Digite os dados corretamente!");
		}
	}
}
