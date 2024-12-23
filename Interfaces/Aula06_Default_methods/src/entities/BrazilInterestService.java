package entities;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService{
	private Double interest;
	
	public BrazilInterestService(Double interest) {
		this.interest = interest;
	}

	@Override
	public double getInterestRate() {
		return this.interest;
	}

	
}
