package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		String[] vectNomes = new String[sc.nextInt()];
		int[] vectIdades = new int[vectNomes.length];
		
		int maisVelhaIdade =  0;
		int posicaoMaisVelha = 0;
		
		for(int i = 0; i < vectNomes.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			vectNomes[i] = sc.next();
			System.out.print("Idade: ");
			vectIdades[i] = sc.nextInt();
			posicaoMaisVelha = vectIdades[i] > vectIdades[posicaoMaisVelha] ? i : posicaoMaisVelha; 
			
		}
		System.out.println();
		System.out.printf("PESSOA MAIS VELHA: %s%n", vectNomes[posicaoMaisVelha]);
		
		sc.close();
	}

}
