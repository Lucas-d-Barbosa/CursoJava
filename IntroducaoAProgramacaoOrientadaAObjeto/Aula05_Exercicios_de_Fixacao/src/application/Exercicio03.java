package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;
public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String name = sc.nextLine();
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		Student studant = new Student(name, nota1, nota2, nota3);
		studant.finalGrade();
		
		sc.close();
	}

}
