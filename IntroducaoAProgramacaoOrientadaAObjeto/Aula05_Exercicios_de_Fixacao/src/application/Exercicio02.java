package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp1 = new Employee();
		
		System.out.print("Name: ");
		emp1.setName(sc.nextLine());
		
		System.out.print("Gross salary: ");
		emp1.setSalary(sc.nextDouble());
		
		System.out.print("Tax: ");
		emp1.setTax(sc.nextDouble());
		
		System.out.println("Employee: " + emp1);
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		emp1.increaseSalary(percentage);
		
		System.out.println("Updated data: " + emp1);
		sc.close();
	}

}
