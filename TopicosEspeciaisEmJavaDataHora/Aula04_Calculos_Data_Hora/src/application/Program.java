package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T15:44:50");
		Instant d06 = Instant.parse("2022-07-20T01:44:50Z");
		
		LocalDate pastWeekLocalDate = d04.minusWeeks(1);
		LocalDate nextWeekLocalDate = d04.plusWeeks(1);
		
		System.out.println("Past Week d04 = " + pastWeekLocalDate);
		System.out.println("Next Week d04 = " + nextWeekLocalDate);
		System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1).plusHours(2);
		LocalDateTime nextWeekLocalDateTime  = d05.plusWeeks(1).minusHours(2);
		
		System.out.println("Past Week d05 = " + pastWeekLocalDateTime);
		System.out.println("Next Week d05 = " + nextWeekLocalDateTime);
		System.out.println();
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant  = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Past Week d06 = " + pastWeekInstant);
		System.out.println("Next Week d06 = " + nextWeekInstant);
		System.out.println();
		
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay()); // precisa converter ambos para LocalDateTime senão da erro
		Duration t2 = Duration.between(pastWeekLocalDateTime, nextWeekLocalDateTime);
		Duration t3 = Duration.between(pastWeekInstant, nextWeekInstant);
		Duration t4 = Duration.between(nextWeekLocalDateTime, pastWeekLocalDateTime);
		
		System.out.println("Duration between pastWeekLocalDate and nextWeekLocalDate = " + t1.toDays() + " days");
		System.out.println("Duration between pastWeekLocalDateTime and nextWeekLocalDateTime = " + t2.toDays() + " days");
		System.out.println("Duration between pastWeekInstant and nextWeekInstant = " + t3.toDays() + " days");
		System.out.println("Duration between nextWeekLocalDateTime and pastWeekLocalDateTime = " + t4.toDays() + " days");
	}

}
