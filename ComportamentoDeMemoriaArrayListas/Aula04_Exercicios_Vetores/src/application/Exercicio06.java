package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		double[] vect = new double[sc.nextInt()];
		double media = 0.0;
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR: %.3f%n", media / vect.length);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < media / vect.length) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
