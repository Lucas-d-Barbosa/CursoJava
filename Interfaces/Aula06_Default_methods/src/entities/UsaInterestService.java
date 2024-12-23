package entities;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService{
	private Double interest;
	
	public UsaInterestService(Double interest) {
		this.interest = interest;
	}
	@Override
	public double getInterestRate() {
		return this.interest;
	}
	

	
}
