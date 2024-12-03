package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		LocalDate d04 = LocalDate.parse("2024-09-15");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-12T15:44:50");
		Instant d06 = Instant.parse("2024-07-12T15:44:50Z");
		Instant d07 = Instant.now(); 
		String data = "10/07/2024";
		LocalDate d08 = LocalDate.parse(data, fmt1);
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d05 = " + fmt2.format(d05));
		System.out.println("d06 = " + fmt3.format(d06)); // Só da para chamar a partir do método do dateformatter por não ter um método format padrão
		System.out.println("d07 = " + fmt3.format(d07));
		System.out.println("d08 = " + fmt1.format(d08));
	}

}
