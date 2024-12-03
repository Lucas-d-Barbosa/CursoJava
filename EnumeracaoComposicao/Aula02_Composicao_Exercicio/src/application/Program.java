package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.HourContract;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String department = sc.next();
		Department dep = new Department(department);
		
		sc.nextLine();
		System.out.println("Enter worker data:");

		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
	
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker employee = new Worker(name, level, baseSalary, dep);
		
		System.out.print("How many contracts to this worker? ");
		int numberOfContracts = sc.nextInt();
		for(int i = 1; i <= numberOfContracts; i++) {
			System.out.printf("Enter contract #%d data:%n", i);
			
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate data = LocalDate.parse(sc.next(), fmt1);
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			Integer hour = sc.nextInt();
			
			employee.addContract(new HourContract(data, valuePerHour, hour));
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String[] data =  sc.next().split("/");
		
		Integer month = Integer.parseInt(data[0]);
		Integer year = Integer.parseInt(data[1]);
		
		System.out.println("Name: " + employee.getName());
		System.out.println("Department: " + employee.getDepartment().getName());
		System.out.printf("Income for %s/%s: %.2f%n", data[0], data[1], employee.income(year, month));
		
		sc.close();
	}

}
