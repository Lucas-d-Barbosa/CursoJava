package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class DesafioPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Room[] quartos = new Room[10];
		System.out.print("How many rooms will be rented? ");
		int alugados = sc.nextInt();
		for(int i = 0; i < alugados; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #" + (i+1) +":");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			quartos[room] = new Room(nome, email, room);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for(Room quarto : quartos) {
			if(quarto == null) {
				continue;
			}
			System.out.println(quarto);
		}
		sc.close();
	}

}
