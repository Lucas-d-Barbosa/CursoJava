package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.printf("Employee #%d:%n", i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(name, salary, id)); 
			
		}
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		
		System.out.println();
		
		System.out.println("List of employees:");
		for(Employee employee : employees) {
			System.out.print(employee);
		}
		sc.close();
	}

}
