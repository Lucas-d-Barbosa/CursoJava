package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BusinessAccount account = new BusinessAccount();
		System.out.println(account.getBalance());
		sc.close();
	}

}
