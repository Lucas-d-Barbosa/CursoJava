package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many values? ");
		PrintService<String> ps = new PrintService<>();
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			ps.addValue(sc.next());
		}
		ps.print();
		String y = ps.first();
		System.out.println("First: " + y);
		sc.close();
	}

}
