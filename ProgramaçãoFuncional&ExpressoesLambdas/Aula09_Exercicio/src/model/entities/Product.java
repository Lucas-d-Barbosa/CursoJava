package model.entities;

public class Product implements Comparable<Product>{
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
	
	@Override
	public String toString() {
		return String.format("%s, %.2f", this.getName(), this.getPrice());
	}
	@Override
	public int compareTo(Product other) {
		return -this.getName().compareTo(other.getName());
	}
}
