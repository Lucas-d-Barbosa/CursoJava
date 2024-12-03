package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = sc.nextInt();
		List<Employee> employees = new ArrayList<>();	
		for(int i = 1; i <= numberOfEmployees; i++) {
			System.out.println();
			System.out.printf("Employee #%d data: %n", i);
			
			System.out.print("Outsourced (y/n)? ");
			char outSourcedConfirmation = sc.next().toUpperCase().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(outSourcedConfirmation != 'Y') {
				employees.add(new Employee(name, hours, valuePerHour));
				continue;
			}
			
			System.out.print("Additional charge: ");
			double additionalCharge = sc.nextDouble();
			
			employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		sc.close();
	}

}
