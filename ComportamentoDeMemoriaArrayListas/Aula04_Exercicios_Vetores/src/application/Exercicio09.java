package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		String[] nomes = new String[sc.nextInt()];
		double[] primeiraNota = new double[nomes.length];
		double[] segundaNota = new double[primeiraNota.length];
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i+1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			primeiraNota[i] = sc.nextDouble();
			segundaNota[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < nomes.length; i++) {
			if((primeiraNota[i] + segundaNota[i]) / 2 >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
