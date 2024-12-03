package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		double[] vect = new double[sc.nextInt()];
		double maiorValor = 0;
		int posicaoMaiorValor = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if(vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicaoMaiorValor = i;
			}
		}
		
		System.out.println();
		
		System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicaoMaiorValor);
		sc.close();
	}

}
