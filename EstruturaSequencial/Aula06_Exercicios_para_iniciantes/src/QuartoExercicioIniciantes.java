import java.util.Locale;
import java.util.Scanner;

public class QuartoExercicioIniciantes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int employeeNumber;
		int hoursWorked;
		double valuePerHours;
		double salary;
		
		employeeNumber = input.nextInt();
		hoursWorked = input.nextInt();
		valuePerHours = input.nextDouble();
		
		salary = hoursWorked * valuePerHours;
		System.out.printf("Number = %d"
				+ "%nSalary = U$ %.2f%n", employeeNumber, salary);
		input.close();
	}

}
