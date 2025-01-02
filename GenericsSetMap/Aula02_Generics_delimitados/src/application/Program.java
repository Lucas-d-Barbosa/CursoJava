package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		List<Product> lista = new ArrayList<>();
		String path = "/home/lucas/Documentos/Code/produtos.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] produto = line.split(",");
				lista.add(new Product(produto[0], Double.parseDouble(produto[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(lista);
			System.out.print("Max: ");
			System.out.println(x);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
