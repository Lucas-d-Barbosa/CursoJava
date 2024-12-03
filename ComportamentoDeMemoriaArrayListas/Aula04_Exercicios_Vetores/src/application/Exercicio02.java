package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		People[] pessoas = new People[sc.nextInt()];
		
		double mediaAltura = 0.0;
		int quantidadeIdadeDezesseis = 0;
		
		
		for(int i = 0; i < pessoas.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dª pessoa:%n", i+1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoas[i] = new People(name,altura, idade);
			mediaAltura += altura;
			
			if(idade < 16) {
				quantidadeIdadeDezesseis += 1;
			}
		}
		
		System.out.printf("Altura média : %.2f%n",  mediaAltura / pessoas.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (double) quantidadeIdadeDezesseis / pessoas.length * 100 );
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getName());
			}
		}
		
		sc.close();
	}

}
