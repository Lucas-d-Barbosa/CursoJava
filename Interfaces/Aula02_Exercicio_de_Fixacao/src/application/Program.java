package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.service.PayPal;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		int numberContract = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		
		System.out.print("Valor do contrato: ");
		double valueContract = sc.nextDouble();
		
		Contract contract = new Contract(numberContract, date, valueContract);
		
		System.out.print("Entre com o numero de parcelas: ");
		int numberInstallments = sc.nextInt();
		
		contract.payInInstallments(numberInstallments, new PayPal());
		System.out.println("Parcelas:");
		System.out.println(contract);
		sc.close();
	}

}
