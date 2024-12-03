package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		double totalBalance = 0;
		list.add(new BusinessAccount(1001, "Lucas",750.0, 500.0));
		list.add(new SavingsAccount(1002, "Luiz", 500.0, 0.01));
		list.add(new BusinessAccount(1003, "Eduardo",910.0, 234.0));
		for(Account acc : list) {
			acc.deposit(10.0);
			totalBalance += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n",totalBalance);
	}

}
