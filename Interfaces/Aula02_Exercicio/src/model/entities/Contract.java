package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.services.PaymentService;

public class Contract {
	private Integer numberContract;
	private LocalDate dateOfContract;
	private Double valueTotalContract;
	private List<Installment> list = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(Integer numberContract, LocalDate dateOfContract, Double valueTotalContract) {
		this.numberContract = numberContract;
		this.dateOfContract = dateOfContract;
		this.valueTotalContract = valueTotalContract;
	}

	public Integer getNumberContract() {
		return numberContract;
	}

	public void setNumberContract(Integer numberContract) {
		this.numberContract = numberContract;
	}

	public LocalDate getDateOfContract() {
		return dateOfContract;
	}

	public void setDateOfContract(LocalDate dateOfContract) {
		this.dateOfContract = dateOfContract;
	}

	public Double getValueTotalContract() {
		return valueTotalContract;
	}

	public void setValueTotalContract(Double valueTotalContract) {
		this.valueTotalContract = valueTotalContract;
	}
	
	public void generatePlots(int quantityInstallment, PaymentService paymentService) {
		double value = this.valueTotalContract / quantityInstallment;
		for(int i = 1; i <= quantityInstallment; i++) {
			value += Math.round(value * 0.01 * 1);
			list.add(new Installment(this.dateOfContract.plusMonths(i), paymentService.tax(value)));
		}
	}
	
	public List<Installment> installments(){
		return this.list;
	}
	
	
}
