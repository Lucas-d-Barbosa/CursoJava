package entities;

public class LegalEntity extends Taxpayer{
	private Integer numberOfEmployees;
	
	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double tax() {
		if(this.numberOfEmployees > 10)
			return this.annualIncome * 0.14;
		return this.annualIncome * 0.16;
	}
}
