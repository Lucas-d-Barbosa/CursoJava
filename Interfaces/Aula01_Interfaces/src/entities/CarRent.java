package entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarRent {
	private static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");	
	private Vehicle vehicle;
	private LocalDateTime start;
	private LocalDateTime finish;
	private Invoice invoice;
	
	public CarRent() {
	
	}


	public CarRent(Vehicle vehicle, LocalDateTime start, LocalDateTime finish) {
		this.vehicle = vehicle;
		this.start = start;
		this.finish = finish;
	}
	
	
	
	public Vehicle getCar() {
		return vehicle;
	}


	public void setCar(Vehicle car) {
		this.vehicle = car;
	}


	public LocalDateTime getPickup() {
		return start;
	}


	public void setPickup(LocalDateTime pickup) {
		this.start = pickup;
	}


	public LocalDateTime getReturnCar() {
		return finish;
	}


	public void setReturnCar(LocalDateTime returnCar) {
		this.finish = returnCar;
	}
	
	public Invoice getInvoice() {
		return invoice;
	}


	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	@Override
	public String toString() {
		return String.format("");
	}
}
