package model.service;

import model.entities.Contract;

public interface ServicePayment {
	public void generateInstallments(int Installments, Contract contrato);
}
