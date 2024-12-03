package entities;

public class Student {
	private String name;
	private double nota1;
	private double nota2;
	private double nota3;
	

	public Student() {
		
	}
	
	public Student(String name, double nota1, double nota2, double nota3) {
	
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public void finalGrade() {
		double finalGrade = nota1 + nota2 + nota3;
		if(finalGrade >= 100 * 0.6) {
			System.out.println("Final GRADE = " + finalGrade);
			System.out.println("PASS");
		}
		else {
			System.out.println("Final GRADE = " + finalGrade);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 100 * 0.6 - finalGrade);
		}
	}
	
}
