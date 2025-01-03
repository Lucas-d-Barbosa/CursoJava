package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		// /home/lucas/Documentos/Code/employees.txt
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		System.out.print("Enter full file path: ");
		try(BufferedReader br = new BufferedReader(new FileReader(sc.next()))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			System.out.print("Enter salary: ");
			double salaryFilter = sc.nextDouble();
			List<String> emplyoeesFilter = list.stream().filter(x -> x.getSalary() > salaryFilter).map(x -> x.getEmail()).collect(Collectors.toList());
			emplyoeesFilter.sort(comp);
			for(String e : emplyoeesFilter) {
				System.out.println(e);
			}
			double sumSalarys = list.stream().filter(x -> x.getName().toUpperCase().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x, y) -> x + y);
			System.out.print("Sum of salary of people whose name starts with 'M': " + sumSalarys);
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
