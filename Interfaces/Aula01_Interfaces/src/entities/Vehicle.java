package entities;

public class Vehicle {
	private String carModel;
	
	public Vehicle(String carModel){
		this.carModel = carModel;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n", this.carModel);
	}
}
