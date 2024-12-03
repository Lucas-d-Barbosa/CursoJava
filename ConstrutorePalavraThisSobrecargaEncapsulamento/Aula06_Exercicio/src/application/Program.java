package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc1;
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String confirmation = sc.next();
		
		if(confirmation.toLowerCase().charAt(0) == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			acc1 = new Account(accountNumber, name, initialValue);
		}
		else {
			acc1 = new Account(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.print(acc1);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		acc1.deposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.print(acc1);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		acc1.withdraw(sc.nextDouble());
		System.out.print(acc1);
		
		sc.close();
	}
}
