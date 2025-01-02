package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client c1 = new Client("Lucas", "lucas@gmail.com");
		Client c2 = new Client("Lucas", "luiz@gmail.com");
		Client c3 = new Client("Lucas", "lucas@gmail.com");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));
		System.out.println(c1 == c3);
		String s1 = new String("Test");
		String s2 = "Test";
		String s3 = "Test";
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		sc.close();
	}

}
