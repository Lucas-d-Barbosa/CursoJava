package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.PaypalTaxService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Enter number of contract: ");
		int numberContract = sc.nextInt();
		
		System.out.print("Enter date of contract: ");
		LocalDate dateContract = LocalDate.parse(sc.next(), fmt);
		
		System.out.print("Value total of contract: ");
		Double valueTotal = sc.nextDouble();
		
		Contract contract = new Contract(numberContract, dateContract, valueTotal);
		System.out.print("Entre com o numero de parcelas: ");
		int numberOfInstallments = sc.nextInt();
		contract.generatePlots(numberOfInstallments, new PaypalTaxService());
		System.out.println("Parcelas:");
		for(Installment installment : contract.installments()) {
			System.out.println(installment);
		}
		sc.close();
	}

}
