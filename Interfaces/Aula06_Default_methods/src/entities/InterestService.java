package entities;

import java.security.InvalidParameterException;

public interface InterestService {
	public double getInterestRate();
	public default double payment(double amount, int months) {
		if(months <= 0) {
			throw new InvalidParameterException("Months must be greater than zero.");
		}
		return amount * Math.pow((1 + getInterestRate() / 100), months);
	}

}
