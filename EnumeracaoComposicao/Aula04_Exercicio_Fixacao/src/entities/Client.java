package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private String name;
	private String email;
	private LocalDate birthDate;
	private Order order;
	public Client() {
		
	}

	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.format("ORDER SUMMARY:%n"));
		builder.append(String.format("Order moment: %s%n", order.getMoment()));
		builder.append(String.format("Order status: %s%n", order.getStatus()));
		builder.append(String.format("Client: %s %s - %s%n", name,birthDate.format(fmt1), email ));
		builder.append(String.format("Order items:%n"));
		for(OrderItem item : order.getOrderTotal()) {
			builder.append(item.toString());
		}
		return builder.toString();
	}
	
}
