package entities;

public class Product {
	private String name;
	private Double price;
	private Integer quantityInStock;
	
	 Product(){
		
	}
	
	public Product(String name, Double price,Integer quantityInStock) {
		this.name = name;
		this.price = price;
		this.quantityInStock = quantityInStock;
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

	public Integer getQuantityInStock() {
		return quantityInStock;
	}

	public void addQuantityInStock(Integer quantityAdd) {
		this.quantityInStock += quantityAdd;
	}
	
	public void removeQuantityInStock(Integer quantityRemove) throws Exception {
		if(quantityRemove > this.quantityInStock) {
			throw new Exception("Retirada inválida!");
		}
		this.quantityInStock -= quantityRemove;
	}
	
	
	@Override
	public String toString() {
		return String.format("Product %s - "
				+ "Price %.2f - "
				+ "Quantity %d -"
				+ "Total value in stock %.2f%n",
				this.getName(), 
				this.getPrice(), 
				this.getQuantityInStock(),
				this.totalValueInStock());
	}
	
	public Double totalValueInStock() {
		return this.price * this.quantityInStock;
	}
	
	
}
