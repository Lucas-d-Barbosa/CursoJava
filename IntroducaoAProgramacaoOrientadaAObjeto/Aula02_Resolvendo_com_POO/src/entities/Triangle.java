package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	public double p;
	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		this.p = (a + b + c) / 2;
	}
	
	public double area() {
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
