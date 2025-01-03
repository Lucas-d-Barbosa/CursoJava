package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 100.0));
		list.add(new Product("HD Case", 80.0));
		list.add(new Product("Mouse", 40.0));
		list.forEach(new PriceUpdate());
		list.forEach(System.out::println);
		System.out.println("-----------------");
		list.forEach(Product::staticPriceUpdate);
		list.forEach(System.out::println);
		System.out.println("******************");
		list.forEach(Product::nonStaticPriceUpdate);
		list.forEach(System.out::println);
		System.out.println("___________________");
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
		list.forEach(cons);
		list.forEach(System.out::println);
		System.out.println("++++++++++++++++++++");
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		list.forEach(System.out::println);
	}
}
