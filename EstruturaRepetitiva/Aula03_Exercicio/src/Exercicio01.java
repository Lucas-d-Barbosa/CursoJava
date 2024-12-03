import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int senhaValida = 2002;
		int senhaDigitada = 0;
		senhaDigitada = input.nextInt();
		while(senhaDigitada != senhaValida) {
			System.out.println("Senha Invalida");
			senhaDigitada = input.nextInt();
		}
		System.out.println("Acesso Permitido");
		input.close();
	}

}
