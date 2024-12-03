package entities;

public class Room {

	private String nome;
	private String email;
	private int roomNumber;
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setNome(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Room(String nome, String email, int roomNumber) {
		this.nome = nome;
		this.email = email;
		this.roomNumber = roomNumber;
	}

	
	public String toString() {
		return String.format("%d: %s, %s", roomNumber, nome, email);
	}
	
	
}
