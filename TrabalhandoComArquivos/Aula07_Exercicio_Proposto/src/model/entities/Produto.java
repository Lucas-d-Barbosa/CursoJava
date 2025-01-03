package model.entities;

public class Produto {
	private String name;
	private Double price;
	private Integer quantity;
	public Produto() {
	}

	public Produto(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return this.price * this.quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %.2f", name, this.total());
	}
	
	
}
