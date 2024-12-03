package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();
		String strPath = "/home/lucas/Documentos/ArquivosCursoJava/TrabalhandoComArquivos/in.txt";
		String strPathOut = "/home/lucas/Documentos/ArquivosCursoJava/TrabalhandoComArquivos/out.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
			while(br.ready()) {
				String line = br.readLine();
				String[] str = line.split(",");
				String name = str[0];
				double price = Double.parseDouble(str[1]);
				int quantity = Integer.parseInt(str[2]);
				lista.add(new Produto(name, price, quantity));
			}
		}catch(IOException e) {
			System.out.println();
		}
		try(BufferedWriter br = new BufferedWriter(new FileWriter(strPathOut, true))){
			for(Produto p : lista) {
				String line = p.toString();
				br.append(line);
				br.newLine();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Sucesso na criação do arquivo!");
		
	}

}
