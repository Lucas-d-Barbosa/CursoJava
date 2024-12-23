package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Double valueInstallment;
	private LocalDate dateInstallment;

	public Installment() {

	}
	
	public Installment(Double valueInstallment, LocalDate dateInstallment) {
		this.valueInstallment = valueInstallment;
		this.dateInstallment = dateInstallment;
	}
	public Double getValueInstallment() {
		return valueInstallment;
	}
	public void setValueInstallment(Double valueInstallment) {
		this.valueInstallment = valueInstallment;
	}
	public LocalDate getDateInstallment() {
		return dateInstallment;
	}
	public void setDateInstallment(LocalDate dateInstallment) {
		this.dateInstallment = dateInstallment;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %.2f%n", this.dateInstallment.format(fmt), this.valueInstallment);
	}
	
}
