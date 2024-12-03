package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;
public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		r1.setWidth(width);
		r1.setHeight(height);
		
		System.out.println("AREA = " + r1.area());
		System.out.println("PERIMETER = " + r1.perimeter());
		System.out.println("DIAGONAL = " + r1.diagonal());
		sc.close();
	}

}
