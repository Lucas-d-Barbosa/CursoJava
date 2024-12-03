package entities;

public class Employee {
	private String name;
	private double salary;
	private double tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	@Override
	public String toString() {
		return String.format(
				"%s, "
				+"$ %.2f"
				,name
				,salary - tax
				);
	}
}
