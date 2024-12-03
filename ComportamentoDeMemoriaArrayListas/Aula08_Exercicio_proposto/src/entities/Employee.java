package entities;

public class Employee {
	private String name;
	private Double salary;
	private Integer id;
	
	public Employee(String name, Double salary, Integer id) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void increaseSalary(double value) {
		salary += value / 100 * salary;
	}
	
	public String toString() {
		return String.format("%d, %s, %.2f%n", id, name, salary);
	}

}
