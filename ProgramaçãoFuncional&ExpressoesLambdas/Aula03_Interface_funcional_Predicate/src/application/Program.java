package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 100.0));
		list.add(new Product("HD Case", 80.0));
		list.add(new Product("Mouse", 40.0));
		// Predicate<Product> pred = x -> x.getPrice() > 100;
		// list.removeIf(new ProductPredicate());
		// list.removeIf(Product::staticProductPredicate);
		// list.removeIf(Product::nonProductPredicate);
		// list.removeIf(pred);
		list.removeIf(x -> x.getPrice() > 100);
		list.forEach(x -> System.out.println(x));
	}

}
