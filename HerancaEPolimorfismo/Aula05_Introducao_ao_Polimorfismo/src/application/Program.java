package application;

import java.util.Locale;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Account x = new Account(1024, "Lucas", 1000.0);
		Account y = new SavingsAccount(1025, "Luiz", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println("x = " + x.getBalance() + ", y = " + y.getBalance());
	}

}
