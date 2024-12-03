package application;

import java.util.Scanner;
import java.util.Locale;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[] altura;
		double media = 0;
		
		int n = sc.nextInt();
		altura = new double[n];
		
		for(int i = 0; i < altura.length; i ++) {
			altura[i] = sc.nextDouble();
			media += altura[i];
		}
		
		System.out.printf("AVARAGE HEIGHT: %.2f%n", media / n);
		sc.close();
	}

}
