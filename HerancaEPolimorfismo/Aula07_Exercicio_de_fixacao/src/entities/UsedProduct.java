package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	public final static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return String.format("%s (used) $ %.2f (Manufacture date: %s)", name, price, manufactureDate.format(fmt1));
	}
	
	
}
