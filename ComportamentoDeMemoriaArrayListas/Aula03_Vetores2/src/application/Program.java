package application;
import entities.Product;
import java.util.Scanner;
import java.util.Locale;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double media = 0;
		Product[] products = new Product[n];
		
		for(int i = 0; i < products.length; i ++) {
			sc.nextLine();
			String productName = sc.nextLine();
			
			double price = sc.nextDouble();
			media += price;
			
			
			products[i] = new Product(productName, price);
		
		}
		
		System.out.printf("AVARAGE PRICE: $ %.2f%n", media / products.length);
		
		sc.close();
	}

}
