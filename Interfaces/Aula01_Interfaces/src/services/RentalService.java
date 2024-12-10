package services;

import java.time.Duration;

import entities.CarRent;
import entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRent cr) {
		Long minutes = Duration.between(cr.getPickup(), cr.getReturnCar()).toMinutes();
		Long horas = minutes / 60;
		double basicPayment;
		if(horas <= 12) {
			basicPayment =  Math.ceil(horas) * pricePerHour;
			System.out.println();
		} 
		else {
			basicPayment = pricePerDay * Math.ceil(horas / 24.00);
		}
		
		double tax = taxService.tax(basicPayment);
		cr.setInvoice(new Invoice(basicPayment, tax));
	}

}
