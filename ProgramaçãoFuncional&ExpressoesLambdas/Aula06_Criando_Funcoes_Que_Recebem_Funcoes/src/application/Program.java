package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductServices;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		ProductServices ps = new ProductServices();
		double sum = ps.filteredSum(list, x -> x.getPrice() < 100);
		System.out.println("Sum = " + String.format("%.2f", sum));
	}
	

}
