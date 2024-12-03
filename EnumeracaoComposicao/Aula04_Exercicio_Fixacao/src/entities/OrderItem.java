package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return quantity * price;
	}
	
	public String toString() {
		return String.format("%s, $%.2f, Quantity: %d, Subtotal: %.2f%n", product.getName(), product.getPrice(), quantity, subTotal());
	}
	
}
