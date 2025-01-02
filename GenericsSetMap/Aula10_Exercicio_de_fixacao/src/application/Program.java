package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Set<Integer> students = new HashSet<>();
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("How many students for course A? ");
			int qtdStudents = sc.nextInt();
			for(int i = 0; i < qtdStudents; i++) {
				students.add(sc.nextInt());
			}
			
			System.out.print("How many students for course B? ");
			qtdStudents = sc.nextInt();
			for(int i = 0; i < qtdStudents; i++) {
				students.add(sc.nextInt());
			}
			
			System.out.print("How many students for course C? ");
			qtdStudents = sc.nextInt();
			for(int i = 0; i < qtdStudents; i++) {
				students.add(sc.nextInt());
			}
			System.out.println("Total students: " + students.size());
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
