package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
//import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 100.0));
		list.add(new Product("HD Case", 80.0));
		list.add(new Product("Mouse", 40.0));
		
//		List<Product> listUpperCase = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
//		listUpperCase.forEach(System.out::println);
		
//		List<Product> listUpperCase = list.stream().map(Product::statisUpperCaseName).collect(Collectors.toList());
//		listUpperCase.forEach(System.out::println);

//		List<Product> listUpperCase = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
//		listUpperCase.forEach(System.out::println);

//		Function<Product, Product> func = prod -> {
//			prod.setName(prod.getName().toUpperCase());
//			return prod;
//		};
//		List<Product> listUpperCase = list.stream().map(func).collect(Collectors.toList());
//		listUpperCase.forEach(System.out::println);

		List<Product> listUpperCase = list.stream().map(prod -> {
			prod.setName(prod.getName().toLowerCase());
			return prod;
		}).collect(Collectors.toList());
		listUpperCase.forEach(System.out::println);
	}
}
