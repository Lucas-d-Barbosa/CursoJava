package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		double[] alturas = new double[sc.nextInt()];
		char[] genero = new char[alturas.length];
		double maiorAltura = 0;
		double menorAltura = 40;
		double mediaAlturaMulheres = 0;
		int qtdHomens = 0;
		int qtdMulheres = 0;
		
		for(int i = 0; i < alturas.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			alturas[i] = sc.nextDouble();
			menorAltura = alturas[i] < menorAltura ? alturas[i] : menorAltura;
			maiorAltura = alturas[i] > maiorAltura ? alturas[i] : maiorAltura;
			System.out.printf("Genero da %da pessoa: ", i+1);
			genero[i] = sc.next().toUpperCase().charAt(0);
			if(genero[i] == 'F') {
				mediaAlturaMulheres += alturas[i];
				qtdMulheres += 1;
				continue;
			}
			qtdHomens += 1;
		}
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres / qtdMulheres);
		System.out.printf("Numero de homens = %d%n", qtdHomens);
		sc.close();
	}

}
