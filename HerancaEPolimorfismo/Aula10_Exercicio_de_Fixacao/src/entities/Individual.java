package entities;

public class Individual extends Taxpayer{
	private Double healthSpending;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double tax() {
		if(this.annualIncome < 20000.00)
			return (this.annualIncome * 0.15) - (this.healthSpending * 0.5);
		return (this.annualIncome * 0.25) - (this.healthSpending * 0.5);
	}
}
