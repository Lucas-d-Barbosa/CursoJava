package entities;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static Product statisUpperCaseName(Product prod) {
		prod.setName(prod.getName().toUpperCase());
		return prod;
	}
	
	public Product nonStaticUpperCaseName() {
		 this.setName(this.getName().toUpperCase());
		 return this;
	}
	@Override
	public String toString() {
		return String.format("%s - %.2f",this.getName(),this.getPrice());
	}
}