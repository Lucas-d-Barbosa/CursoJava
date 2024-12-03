package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.next(), fmt1);
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");

		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(status);
		client.setOrder(order);
		
		System.out.print("How many items to this order? ");
		int manyOrder = sc.nextInt();
		
		for(int i = 1; i <= manyOrder; i++) {
			System.out.printf("Enter %d item data:%n", i);
			System.out.print("Product name: ");
			String nameProduct = sc.next();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, new Product(nameProduct, productPrice)); 
			client.getOrder().addItem(orderItem);
		}
		System.out.println();
		System.out.println(client);
		sc.close();
	}	

}
