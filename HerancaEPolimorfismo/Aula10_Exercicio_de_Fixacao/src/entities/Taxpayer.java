package entities;

public abstract class Taxpayer {
	protected String name;
	protected Double annualIncome;
	
	public Taxpayer() {
	}
	
	public Taxpayer(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract double tax();
	
	public String toString() {
		return String.format("TOTAL TAXES: $ %.2f", this.tax());
	}
}
