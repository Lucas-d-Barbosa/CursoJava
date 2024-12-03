package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class Program {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String productName = sc.next();
		Double productPrice = sc.nextDouble();
		int quantityInStock = sc.nextInt();
		
		Product p1 = new Product(productName,productPrice,quantityInStock);
		System.out.print(p1);
		
		p1.addQuantityInStock(5);
		
		System.out.print(p1);
		
		p1.removeQuantityInStock(20);
		
		System.out.print(p1);
		sc.close();
	}

}
