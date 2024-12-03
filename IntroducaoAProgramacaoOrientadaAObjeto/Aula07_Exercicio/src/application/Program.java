package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dolarPrice = sc.nextDouble();
		Calculator.dolarPrice = dolarPrice;
		
		System.out.print("How many dollars will be bought? ");
		double quantityDolar = sc.nextDouble();
		double amount = Calculator.transation(quantityDolar);
		System.out.printf("Amount to be paid in reais = %.2f", amount);
		sc.close();
	}

}
