package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		
		for(int i = 1; i <= numberOfProducts; i++) {
			System.out.println();
			System.out.printf("Product #%d data:%n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = sc.next().toUpperCase().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(typeProduct == 'C') {
				products.add(new Product(name, price));
			} else if(typeProduct == 'U') {
				System.out.print("Manufacture data (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), fmt1);
				products.add(new UsedProduct(name, price, date));
			}
			else if(typeProduct == 'I') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product product : products) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}

}
