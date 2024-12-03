package model.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.exceptions.InvalidReservation;

public class Reservation {
	public static SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkInDate;
	private Date checkOutDate;
	
	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkInDate, Date checkOutDate) throws InvalidReservation {
		boolean verifed = checkInDate.getTime() > checkOutDate.getTime();
		if(verifed) {
			throw new InvalidReservation("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public Integer duration() {
		long nights = ((long)this.checkOutDate.getTime() - this.checkInDate.getTime()) / 1000 / 60 / 60 / 24;
		return (int) nights;
	}
	
	public void updateDates(Date newCheckIn, Date newCheckOut) throws InvalidReservation {
		boolean verifed  = newCheckIn.getTime() > this.checkInDate.getTime();
		verifed &= newCheckOut.getTime() >= this.checkOutDate.getTime();
		if(!verifed) {
			throw new InvalidReservation("Reservations must be for future dates");
		}
		verifed &= newCheckOut.getTime() > newCheckIn.getTime();
		if(!verifed) {
			throw new InvalidReservation("Check-out date must be after check-in date");
		}
		verifed &= newCheckIn.getTime() > Calendar.getInstance().getTime().getTime();
		if(!verifed) {
			throw new InvalidReservation("Reservations dates for update must be futre dates");
		}
		this.checkInDate = newCheckIn;
		this.checkOutDate = newCheckOut;
	}
	
	@Override
	public String toString() {
		return String.format("Reservation: Room %d, check-in: %s, check-out: %s, %d nights%n", this.roomNumber,fmt1.format(this.checkInDate), fmt1.format(this.checkOutDate), this.duration());
	}
}
