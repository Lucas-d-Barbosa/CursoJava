package entities;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	@Override
	public int compareTo(Product other) {
		return this.name.compareTo(other.name) + this.price.compareTo(other.price);
	}
	
	@Override
	public String toString() {
		return String.format("%s - %.2f%n", this.name, this.price);
	}
}
