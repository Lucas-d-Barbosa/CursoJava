package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.service.ServicePayment;

public class Contract {
	private Integer numberContract;
	private LocalDate dateContract;
	private Double valueContract;
	private List<Installment> installments;
	
	public Contract() {

	}

	public Contract(Integer numberContract, LocalDate dateContract, Double valueContract) {
		this.numberContract = numberContract;
		this.dateContract = dateContract;
		this.valueContract = valueContract;
		this.installments = new ArrayList<>();
	}

	public Integer getNumberContract() {
		return numberContract;
	}

	public void setNumberContract(Integer numberContract) {
		this.numberContract = numberContract;
	}

	public LocalDate getDateContract() {
		return dateContract;
	}

	public void setDateContract(LocalDate dateContract) {
		this.dateContract = dateContract;
	}

	public Double getValueContract() {
		return valueContract;
	}

	public void setValueContract(Double valueContract) {
		this.valueContract = valueContract;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	public void addInstallment(Installment installment) {
		this.installments.add(installment);
	}
	
	public void payInInstallments(int numberInstallments, ServicePayment servicePayment) {
		servicePayment.generateInstallments(numberInstallments, this);
	
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(Installment installment : this.getInstallments()) {
			str.append(installment);
		}
		return String.format("%s", str);
	}
	
}
