package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int[] vect = new int[sc.nextInt()];
		int quantidadeDePares = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				quantidadeDePares += 1;
			}
		}
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d%n", quantidadeDePares);
		sc.close();
	}

}
