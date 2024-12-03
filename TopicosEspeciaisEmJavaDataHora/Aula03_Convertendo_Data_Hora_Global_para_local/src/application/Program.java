package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2024-09-15");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-12T15:44:50");
		Instant d06 = Instant.parse("2024-07-12T01:44:50Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
	
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println();
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue()); // pega o int do mês
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println();
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
	}

}
