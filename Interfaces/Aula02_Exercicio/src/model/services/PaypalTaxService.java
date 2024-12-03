package model.services;

public class PaypalTaxService implements PaymentService{
	public PaypalTaxService() {
		
	}
	
	public double tax(double value) {
		return value * 1.02;
	}
	
	
}
