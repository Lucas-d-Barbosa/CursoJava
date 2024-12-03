package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.LegalEntity;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Taxpayer> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int numberOfTaxpayers = sc.nextInt();
		for(int i = 1; i <= numberOfTaxpayers; i++) {
			System.out.printf("Tax payer #%d data: %n", i);
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().toUpperCase().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(type == 'I') {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				list.add(new Individual(name, income, healthSpending));
				continue;
			}
			System.out.print("Number of Employees: ");
			int numberOfEmployees = sc.nextInt();
			list.add(new LegalEntity(name, income, numberOfEmployees));
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes = 0.0;
		for(Taxpayer tax : list) {
			totalTaxes += tax.tax();
			System.out.println(tax);
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxes);
		sc.close();
	}

}
