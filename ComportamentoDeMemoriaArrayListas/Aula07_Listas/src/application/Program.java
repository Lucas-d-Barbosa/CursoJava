package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<String> lista = new ArrayList<>();
		List<Double> numeros = new ArrayList<>();
		numeros.add(2.0);
		numeros.add(4.0);
		numeros.add(8.0);
		
		lista.add("Lucas");
		lista.add("Luiz");
		lista.add("Marcos");
		lista.add("Leo");
		lista.add(2, "Eduardo");
		System.out.println("Lista completa!");
		System.out.println(lista.size());
		for(Object item : lista) {
			System.out.println(item);
		}
		System.out.println("-----------------------------------");
		System.out.println("Lista só com a primeira letra sendo L!");
		
		List<String> nomesComL = lista.stream().filter(item -> item.charAt(0) == 'L').collect(Collectors.toList());
		for(Object item : nomesComL) {
			System.out.println(item);
		}
		System.out.println("Lista completa!");
		System.out.println("-----------------------------------");
		System.out.println("Lista sem a primeira letra sendo L!");
		
		lista.removeIf( x -> x.charAt(0) == 'L');
		for(Object item : lista) {
			System.out.println(item);
		}
		
		List<Double> numerosQuadrados = numeros.stream().map(numero -> numero * numero).collect(Collectors.toList());
		System.out.println("-----------------------------------");
		System.out.println("Lista de números ao quadrado!");
		
		for(Object numero : numerosQuadrados) {
			System.out.println(numero);
		}
	}
	
	public static <T> void add(T item) {
		System.out.println(item);
	}

}
