package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int[] vect = new int[sc.nextInt()];
		double media = 0.0;
		int quantidadePares = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			media += vect[i] % 2 == 0 ? vect[i] : 0;
			quantidadePares += vect[i] % 2 == 0 ? 1 : 0;
		}
		
		if(quantidadePares > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f%n", media / quantidadePares);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
	}

}
