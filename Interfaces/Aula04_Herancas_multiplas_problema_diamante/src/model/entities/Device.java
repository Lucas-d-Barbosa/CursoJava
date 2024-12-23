package model.entities;

public abstract class Device {
	private String seriaNumber;

	public Device() {
		
	}
	
	public Device(String seriaNumber) {
		this.seriaNumber = seriaNumber;
	}

	public String getSeriaNumber() {
		return seriaNumber;
	}

	public void setSeriaNumber(String seriaNumber) {
		this.seriaNumber = seriaNumber;
	}
	
	public abstract void processDoc(String doc);
}
