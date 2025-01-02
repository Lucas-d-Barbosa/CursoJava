package entities;

public class Product implements Comparable<Product>{
	private Double price;
	private String name;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s, %.2f", this.getName(), this.getPrice());
	}

	@Override
	public int compareTo(Product other) {
		return this.getPrice().compareTo(other.getPrice());
		
	}
	
	
}
