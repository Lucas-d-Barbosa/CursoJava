package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/// /home/lucas/Documentos/Code/products.txt
		try (Scanner sc = new Scanner(System.in)) {
			List<Product> products = new ArrayList<>();
			System.out.print("Enter full file path: ");
			try (BufferedReader br = new BufferedReader(new FileReader(sc.next()))) {
				String line = br.readLine();
				while (line != null) {
					String[] prod = line.split(",");
					products.add(new Product(prod[0], Double.parseDouble(prod[1])));
					line = br.readLine();
				}
			} catch (IOException ioException) {
				System.out.println("Error: " + ioException.getMessage());
			}
			double avg = products.stream()
					.map(x -> x.getPrice())
					.reduce(0.0, (x, y) -> x + y) 
					/ products.size();
			
			System.out.println("Avarage price: " + String.format("%.2f", avg));
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> newList = products.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList())
					;
			newList.forEach(System.out::println);
		} catch (Exception generalException) {
			System.out.println("Error: " + generalException.getMessage());
		}

	}

}
