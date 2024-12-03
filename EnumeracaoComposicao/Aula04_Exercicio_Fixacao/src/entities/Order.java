package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private LocalDateTime moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	
	
	public Order() {
		
	}


	public Order(OrderStatus status) {
		this.moment = LocalDateTime.now();
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public List<OrderItem> getOrderTotal() {
		return items;
	}
	public String getMoment() {
		return moment.format(fmt1);
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrderItem item : items) {
			total += item.subTotal();
		}
		
		return total;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
}
