package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc = new Account(1200, "Lucas Barbosa", 250.00);
		BusinessAccount bacc = new BusinessAccount(1201, "Luiz Fernando", 200.00, 500.00);
		System.out.println(acc.getHolder());
		
		
		// UPCASTING
		
		Account acc1 = bacc;
		System.out.println(acc1.getHolder());
		Account acc2 = new BusinessAccount(1234, "Eduardo", 0.0, 200.00);
		System.out.println(acc2.getHolder());
		Account acc3 = new SavingsAccount(2491, "Vitor", 0.0, 0.1);
		System.out.println(acc3.getHolder());
		
		
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		System.out.println(acc4.getLoanLimit());;
		
		
		// O compilador só percebe o erro dps de executar!
//		BusinessAccount acc5 = (BusinessAccount) acc3;
//		System.out.println(acc5.getLoanLimit());
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			System.out.println(acc5.getLoanLimit());
		}else {
			System.out.println("Não pode fazer o casting desse objeto para BusinessAccount!");
		}
		sc.close();
	}

}
