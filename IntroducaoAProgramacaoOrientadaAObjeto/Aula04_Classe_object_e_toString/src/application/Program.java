package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.next();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantityInStock = sc.nextInt();
		
		System.out.print("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantityAdd = sc.nextInt();
		product.addProducts(quantityAdd);
		
		System.out.print("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int quantityRemove = sc.nextInt();
		product.removeProducts(quantityRemove);
		
		System.out.print("Updated data: " + product);
		System.out.println();
		sc.close();
	}

}
