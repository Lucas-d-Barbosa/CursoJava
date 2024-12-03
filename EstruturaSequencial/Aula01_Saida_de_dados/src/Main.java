import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
//		int y = 32;
//		double x = 10.3575;
//		//System.out.print("Olá, mundo! ");
//		//System.out.println("Bom dia!");
//		
//		System.out.println("Valor da variáve 'y' é: " + y);
//		System.out.printf("Valor da variáve 'x' é: %.2f%n", x);
//		System.out.printf("Valor da variáve 'x' é: %.4f%n", x);
//		System.out.println("RESULTADO = " + x + " metros");
//		System.out.printf("RESULTADO = %.4f metros%n", x);
		
		String nome = "Lucas";
		int idade = 22;
		double renda = 200.00;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}
}
