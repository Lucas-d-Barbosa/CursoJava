package model.exceptions;

public class InvalidReservation extends Exception{
	private static final long serialVersionUID = 1L;

	public InvalidReservation(String message) {
		super(message);
	}
}
