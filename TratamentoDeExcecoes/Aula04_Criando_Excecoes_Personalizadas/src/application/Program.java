package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.InvalidReservation;

public class Program {
	public static void main(String[] args) throws ParseException, InvalidReservation {
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			
			System.out.print("Check-in date: (dd/MM/yyyy): ");
			Date date1 = fmt1.parse(sc.next());
			
			System.out.print("Check-out date: (dd/MM/yyyy): ");
			Date date2 = fmt1.parse(sc.next());
			
			Reservation reservation = new Reservation(roomNumber, date1, date2);
			System.out.println(reservation);

			System.out.println("Enter data to update the reservation:");
					
			System.out.print("Check-in date: (dd/MM/yyyy): ");
			Date date3 = fmt1.parse(sc.next());
			
			System.out.print("Check-out date: (dd/MM/yyyy): ");
			Date date4 = fmt1.parse(sc.next());
			
			reservation.updateDates(date3, date4);
			System.out.println(reservation);
			
		} catch(InvalidReservation e){
			
			System.out.printf("Error in reservation: %s%n", e.getMessage());
		
		}catch(ParseException e){
			
			System.out.printf("Error: Enter the correct date format%n");
		
		} catch(InputMismatchException e){
			
			System.out.printf("Error: Enter the correct data type%n");
		
		} 
		finally {			
			
			sc.close();
		
		}
	}
}
