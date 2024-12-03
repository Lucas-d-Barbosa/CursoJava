package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		System.out.println("End of Program!");
		
	}
	public static void method1() {
		System.out.println("***METHODE1 START***");
		method2();
		System.out.println("***METHODE1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHODE2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch(InputMismatchException e) {
			System.out.println(e.toString());
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			sc.next();
		}
		sc.close();
		System.out.println("***METHODE2 END***");
	}

}
