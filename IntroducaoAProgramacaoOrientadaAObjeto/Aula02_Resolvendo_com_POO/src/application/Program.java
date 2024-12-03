package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Triangle tX = new Triangle(3, 4, 5);
		Triangle tY = new Triangle(7.5, 4.5, 4.02);
		
		System.out.printf("%.4f%n",tX.area());
		System.out.printf("%.4f%n",tY.area());
		input.close();
	}

}
