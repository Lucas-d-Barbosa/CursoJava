package model.service;

import model.entities.Contract;
import model.entities.Installment;

public class PayPal implements ServicePayment{
	public void generateInstallments(int Installments, Contract contract) {
		double amountBasic = contract.getValueContract() / Installments;
		for(int i = 1; i <= Installments; i++) {
			double valueInstallment = (amountBasic + (amountBasic * 0.01) * i);
			valueInstallment += valueInstallment * 0.02;
			contract.addInstallment(new Installment(valueInstallment, contract.getDateContract().plusMonths(i)));
		
		}
	}
}
