package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.enums.OrderStatus;

public class Order {
	public static final DateTimeFormatter FMT1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Integer id;
	private LocalDate moment;
	private OrderStatus status;
	
	public Order() {
		
	}
	
	public Order(Integer id, LocalDate moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment.format(FMT1) + ", status=" + status + "]";
	}
	
	
	
	
}
