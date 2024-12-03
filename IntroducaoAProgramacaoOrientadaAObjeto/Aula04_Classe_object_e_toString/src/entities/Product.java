package entities;

public class Product {
	public String name;
	public double price;
	public int quantityInStock;
	
	public double totalValueInStock() {
		return price * quantityInStock;
	}
	
	public void addProducts(int quantity) {
		this.quantityInStock += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantityInStock -= quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s, $ %.2f, " +  
				"%d Units, Total: $ %.2f%n"
				, name
				, price
				, quantityInStock
				, totalValueInStock());
	}
	
}
