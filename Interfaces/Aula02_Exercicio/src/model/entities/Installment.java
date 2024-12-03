package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate dateInstallment;
	private Double valueInstallment;

	public Installment(LocalDate dateInstallment, Double valueInstallment) {
		this.dateInstallment = dateInstallment;
		this.valueInstallment = valueInstallment;
	}
	public LocalDate getDateInstallment() {
		return dateInstallment;
	}
	public void setDateInstallment(LocalDate dateInstallment) {
		this.dateInstallment = dateInstallment;
	}
	public Double getValueInstallment() {
		return valueInstallment;
	}
	public void setValueInstallment(Double valueInstallment) {
		this.valueInstallment = valueInstallment;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %.2f", this.dateInstallment.format(fmt), this.valueInstallment);
	}
	
}
