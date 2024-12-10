package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRent;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Car model: ");
		Vehicle carModel = new Vehicle(input.nextLine());
		
		System.out.print("Pickup: ");
		LocalDateTime pickup = LocalDateTime.parse(input.nextLine(),fmt1);
		
		System.out.print("Return: ");
		LocalDateTime returnCar = LocalDateTime.parse(input.nextLine(),fmt1);
		
		CarRent cr = new CarRent(carModel, pickup, returnCar);
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = input.nextDouble();
		
		System.out.print("Entre com o proço por dia: ");
		double pricePerDay = input.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
		input.close();
	}

}
