package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Log;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ISO_DATE_TIME;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String path = "/home/lucas/Documentos/Code/log.txt";
		System.out.print("Enter file full path: ");
		path = sc.next();
		Set<Log> users = new HashSet<>();
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] data = line.split(" ");
				LocalDateTime date = LocalDateTime.parse(data[1], fmt1);
				users.add(new Log(data[0], date));
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Total users: " + users.size());
		
		sc.close();
		
		
	}

}
