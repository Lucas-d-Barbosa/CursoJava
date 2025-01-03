package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		System.out.print("Enter the number of shapes: ");
		int number = sc.nextInt();
		for(int i = 1; i <= number; i++) {
			System.out.println();
			System.out.printf("Shape %d data:%n", i);
			System.out.print("Rectangle or Circle (r/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			if(type == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
				continue;
			}
			
			System.out.print("Radius: ");
			double radius = sc.nextDouble();
			list.add(new Circle(color, radius));
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : list) {
			System.out.printf("%.2f%n",shape.area());
		}
		sc.close();
	}

}
